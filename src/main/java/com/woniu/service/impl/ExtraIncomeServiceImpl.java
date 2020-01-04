package com.woniu.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.woniu.dao.ExtraIncomeMapper;
import com.woniu.domain.ExtraIncome;
import com.woniu.domain.ExtraIncomeExample;
import com.woniu.service.ExtraIncomeService;

@Transactional
@Service
public class ExtraIncomeServiceImpl implements ExtraIncomeService {

	@Autowired
	private ExtraIncomeMapper mapper;

	@Override
	public void delete(Integer year, Integer month, Integer eid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(MultipartFile file, ExtraIncome ei) {
		// TODO Auto-generated method stub
		HSSFWorkbook wb;
		try {
			wb = new HSSFWorkbook(file.getInputStream());
			Iterator<Sheet> sheetIterator = wb.sheetIterator();
			//遍历文件中所有的表（每个表含有一个员工的外工资信息）
			while (sheetIterator.hasNext()) {
				Sheet sheet = sheetIterator.next();
				Iterator<Row> rowIterator = sheet.rowIterator();
				//表中第一个字段固定位员工ID，直接取出即可
				Integer eid = (int) rowIterator.next().getCell(1).getNumericCellValue();
				ei.setEmpId(eid);
				//将除了合计栏之外的外工资项放入map中，方便转为json字符串
				Map<String, Double> map = new HashMap<String, Double>();
				while (rowIterator.hasNext()) {
					Row row = rowIterator.next();
					//获取每行第一列的值，为项目名称(第二列为项目金额)
					String str = row.getCell(0).getStringCellValue();
					if (str.equals("合计")) {
						ei.setTotal(new BigDecimal(row.getCell(1).getNumericCellValue()));
						continue;
					}
					map.put(row.getCell(0).getStringCellValue(), row.getCell(1).getNumericCellValue());

				}
				ei.setExtraIncomeDetail(JSONObject.toJSONString(map));
				mapper.insertSelective(ei);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// mapper.insertSelective(ei);
	}

	@Override
	public ExtraIncome findSelective(Integer year, Integer month, Integer eid) {
		// TODO Auto-generated method stub
		ExtraIncomeExample ee = new ExtraIncomeExample();
		ee.or().andYearEqualTo(year).andMonthEqualTo(month).andEmpIdEqualTo(eid);
		List<ExtraIncome> list = mapper.selectByExample(ee);
		if(list.size()==0) {
			ExtraIncome ecome = new ExtraIncome();
			ecome.setEmpId(eid);
			ecome.setYear(year);
			ecome.setMonth(month);
			return ecome;
		}
		return list.get(0);
	}

	@Override
	public ExtraIncome findLatest(Integer eid) {
		// TODO Auto-generated method stub
		ExtraIncomeExample ee = new ExtraIncomeExample();
		ee.setOrderByClause("YEAR desc,MONTH desc");
		ee.or().andEmpIdEqualTo(eid);
		List<ExtraIncome> list = mapper.selectByExample(ee);
		if(list.size()==0)
			return null;
		return list.get(0);
	}

}
