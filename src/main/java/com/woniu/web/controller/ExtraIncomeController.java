package com.woniu.web.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.Emps;
import com.woniu.domain.ExtraIncome;
import com.woniu.service.EmpsService;
import com.woniu.service.ExtraIncomeService;

@Controller
@RequestMapping("extraIncome")
public class ExtraIncomeController {

	@Autowired
	private ExtraIncomeService service;
	@Autowired
	private EmpsService empService;

	@RequestMapping("findUI")
	public String findUI(Model model, Integer eid, Integer year, Integer month) {
		Emps emp = null;
		ExtraIncome ecome = null;
		if (eid == null) {
			String oaCount = (String) SecurityUtils.getSubject().getPrincipal();
			emp = empService.findByOaCount(oaCount);
			ecome = service.findLatest(emp.getEmpId());
		} else {
			emp = empService.find(eid);
			ecome = service.findSelective(year, month, eid);
		}
		model.addAttribute("ecome", ecome);
		model.addAttribute("emp", emp);
		return "jsp/sal/extra_incomeUI";
	}

	@RequestMapping("upload")
	public String upload(MultipartFile file, Integer year, Integer month, String remark) {
		ExtraIncome extraIncome = new ExtraIncome();
		extraIncome.setMonth(month);
		extraIncome.setYear(year);
		extraIncome.setRemark(remark);
		service.save(file, extraIncome);
		return "jsp/sal/importEI";
	}
}
