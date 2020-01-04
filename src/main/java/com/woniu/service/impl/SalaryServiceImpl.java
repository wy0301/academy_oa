package com.woniu.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.dao.SalMapper;
import com.woniu.domain.Sal;
import com.woniu.domain.SalExample;
import com.woniu.domain.SalExample.Criteria;
import com.woniu.service.SalaryService;
@Service
@Transactional
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SalMapper mapper;

	@Override
	public void importSalary(MultipartFile file) {
		
		InputStream in=null;
		try {
			 in=file.getInputStream();;
			//得到读取到的工作簿
			HSSFWorkbook wb=new HSSFWorkbook(in);
			//选择工作簿的第一个sheet
			HSSFSheet sheet=wb.getSheetAt(0);
			//通过面板获取到该面板中的所有行的迭代器
			Iterator<Row> rowIterator = sheet.rowIterator();
			//跳过第一行
			rowIterator.next();
			while(rowIterator.hasNext()) {
				Sal sal=new Sal();
				Row row = rowIterator.next();
				//获取列迭代器
				Iterator<Cell> cellIterator = row.cellIterator();
				//记录列循环次数
				int count=0;
				
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					String cellType = cell.getCellType().toString();
					Object value=null;
					//判断接收的类型
					if("STRING".equals(cellType)) {
						value=cell.getStringCellValue();
					}else if ("NUMERIC".equals(cellType)) {
						value=cell.getNumericCellValue();
					}else if("FORMULA".equals(cellType)) {
						value=cell.getNumericCellValue();
					}
					switch (count) {
					case 0:
						sal.setSalId(null);
						count++;
						break;
					case 1:
						sal.setEmpId(((Double) value).intValue());
						count++;
						break;
					case 2:
						sal.setYear(((Double) value).intValue());
						count++;
						break;
					case 3:
						sal.setMonth(((Double) value).intValue());
						count++;
						break;
					case 4:
						sal.setBasepay((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 5:
						sal.setJobAllowance((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 6:
						sal.setCommAllowance((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 7:
						sal.setDutyAllowance((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 8:
						sal.setHealthAllowance((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 9:
						sal.setPublicHousingFund((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 10:
						sal.setExtraIncomeId((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 11:
						sal.setWithholdingTax((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 12:
						sal.setWithholdingTotle((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 13:
						sal.setPayableSal((BigDecimal.valueOf((Double) value)));
						count++;
						break;
					case 14:
						sal.setActualSal((BigDecimal.valueOf((Double) value)));
						count++;
						break;	
					}
					System.out.print(value+"\t");
					
				}
				System.out.println("!!"+sal);
				mapper.insertSelective(sal);
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public List<Sal> findSalToEmpToDept(Integer year,Integer month) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		if(year==null||year==0) {
			year=2019;
		};
		if(month==null||month==0) {
			month=1;
		};
		map.put("year", year);
		map.put("month", month);
		return mapper.findSalToEmpToDept(map);
	}

	@Override
	public Sal findSal(Integer empId,Integer year,Integer month) {
		Integer salId = getSalId(empId,year,month);
		return mapper.selectByPrimaryKey(salId);
	}
	public Integer getSalId(Integer empId,Integer year,Integer month) {
		
		SalExample salExample = new SalExample();
		
		Criteria criteria = salExample.createCriteria();
		criteria.andMonthEqualTo(month);
		criteria.andEmpIdEqualTo(empId);
		criteria.andYearEqualTo(year);
		List<Sal> list = mapper.selectByExample(salExample);
		Integer salId=null;
		for (Sal sal : list) {
			salId=sal.getSalId();
		}
		return salId;
	}


}
