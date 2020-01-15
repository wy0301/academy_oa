package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Syslog;
import com.woniu.service.SyslogService;

@Controller
@RequestMapping("syslogs")
public class SyslogController {

	@Autowired
	private SyslogService service;
	
	@RequestMapping("findUI")
	public String findUI(Model model) {
		List<Syslog> list = service.findAll();
		model.addAttribute("list", list);
		return "jsp/log/findUI";
	}
	
	@RequestMapping("findSelective")
	public String findSelective(String beginTime,String endTime,String operName,String operType) {
		System.out.println(beginTime);
		System.out.println(endTime);
		System.out.println(operName);
		System.out.println(operType);
		return "";
	}
}
