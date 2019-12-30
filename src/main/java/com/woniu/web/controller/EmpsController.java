package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Emps;
import com.woniu.domain.Roles;
import com.woniu.service.EmpsService;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("emps")
public class EmpsController {
	
	@Autowired
	private EmpsService service;
	@Autowired
	private RolesService rolesService;
	
	@RequiresPermissions("emps:save")
	@RequestMapping("save")
	public String save(Emps e) {
		service.save(e);
		return "index";
	}
	
	@RequiresPermissions("emps:delete")
	@RequestMapping("delete/{eid}")
	public String delete(@PathVariable Integer eid) {
		System.out.println(eid);
		service.delete(eid);
		return "index";
	}
	
	@RequiresPermissions("emps:find")
	@RequestMapping("find")
	public String find(Model model) {
		List<Emps> list=service.find();
		model.addAttribute("list", list);
		return "jsp/emp/findUI";
	}
	
	@RequiresPermissions("emps:find")
	@RequestMapping("updateUI/{rid}")
	public String updateUI(@PathVariable Integer eid,Model model) {
		Emps emps = service.find(eid);
		model.addAttribute("emps", emps);
		return "index";
	}
	
	@RequiresPermissions("emps:update")
	@RequestMapping("update")
	public String update(Emps e) {
		service.update(e);
		return "index";
	}
	
	@RequestMapping("login")
	public String login(String oa_account,String oa_password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(oa_account,oa_password);
		System.out.println(oa_account);
		try {
			subject.login(token);
			System.out.println("认证成功");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("认证失败");
		}
		return "redirect:/jsp/home.jsp";
	}
	
	@RequestMapping("grantRolesUI/{eid}")
	@RequiresPermissions("emp:grantRoles")
	public String grantRolesUI(Model model,@PathVariable Integer eid) {
		System.out.println(eid);
		List<Roles> rolesOwned = service.findRolesByEmpID(eid);
		List<Roles> rolesNotOwned = rolesService.findAll();
		rolesNotOwned.removeAll(rolesOwned);
		model.addAttribute("rolesOwned", rolesOwned);
		model.addAttribute("rolesNotOwned", rolesNotOwned);
		model.addAttribute("eid", eid);
		System.out.println(rolesOwned);
		System.out.println(rolesNotOwned);
		return "jsp/emp/grantroles";
	}
	
	@RequestMapping("grantRoles")
	@RequiresPermissions("emp:grantRoles")
	public String grantRoles(Integer eid,Integer[] roles) {
		System.out.println(roles);
		service.removeRolesByEid(eid);
		service.grantRolesByEid(eid, roles);
		return "redirect:/emps/find";
	}
}
