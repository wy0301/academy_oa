package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.woniu.domain.Emps;
import com.woniu.domain.Sal;
import com.woniu.service.EmpsService;
import com.woniu.service.SalaryService;

@Configuration
@RequestMapping("salary")
public class SalaryController {

	@Autowired
	private SalaryService salService;
	@Autowired
	private EmpsService empService;
	
	@RequestMapping("save")
	@RequiresPermissions("salary:import")
	public String save(MultipartFile file) throws IOException {
		salService.importSalary(file);
		return "redirect:/salary/findSalToEmp";
	}
	@RequestMapping("findSalToEmp")
	@RequiresPermissions("salary:findAll")
	public String findEmp(Model model,Integer year,Integer month) {
		List<Sal> salList = salService.findSalToEmpToDept(year,month);
		model.addAttribute("salList", salList);
		return "jsp/salary/wageinfo";//jsp/salary/wageinfo
	}
	@RequestMapping("findSal")
	public String findEmp(Integer empId,Model model,Integer year,Integer month) {
		Sal sal = salService.findSal(empId,year,month);
		Emps emp = empService.find(empId);
		model.addAttribute("sal",sal);
		model.addAttribute("emp",emp);
		return "jsp/salary/exportdetail";//jsp/salary/exportdetail
	}
	@RequestMapping("findLoinger")
	public String findLoinger(String oaAccount,Model model) {
		Emps emp = empService.findEmp(oaAccount);
		Integer empId = emp.getEmpId();
		return "redirect:/salary/findSal?empId="+empId;
	}
}
