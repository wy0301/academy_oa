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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.service.PermissionsService;
import com.woniu.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private RolesService rolesService;
	@Autowired
	private PermissionsService permissionsService;

	@RequestMapping("findAll")
	@RequiresPermissions("roles:select")
	public String findAll(Model model) {
		List<Roles> list = rolesService.findAll();
		model.addAttribute("rolesList", list);
		return "jsp/role/findUI";
	}

	@RequestMapping("delete/{rid}")
	@RequiresPermissions("roles:delete")
	public String delete(@PathVariable Integer rid) {
		rolesService.delete(rid);
		return "redirect:/roles/findAll";
	}

	@RequestMapping("save")
	@RequiresPermissions("roles:save")
	public String save(Roles roles) {
		rolesService.save(roles);
		return "redirect:/roles/findAll";
	}

	@RequestMapping("update")
	@RequiresPermissions("roles:update")
	public String update(Roles roles) {
		rolesService.update(roles);
		return "redirect:/roles/findAll";
	}

	@RequestMapping("updateUI/{rid}")
	@RequiresPermissions("roles:select")
	public String update(Model model, @PathVariable Integer rid) {
		Roles roles = rolesService.findById(rid);
		model.addAttribute("roles", roles);
		return "jsp/role/updaterole";
	}

	@RequestMapping("grantPermissionsUI/{rid}")
	@RequiresPermissions("permission:grant")
	public String grantPermissions(@PathVariable Integer rid, Model model) throws JsonProcessingException {
		Roles r = rolesService.findById(rid);
		model.addAttribute("roles", r);
		// 获取所有权限组成的json数组
		List<Permissions> list = permissionsService.findAll();
		ObjectMapper om = new ObjectMapper();
		String treejson = om.writeValueAsString(list);
		model.addAttribute("treejson", treejson);
		// 获取角色已有的权限
		List<Permissions> hasPermissoinsList = rolesService.selectPermissionByRid(rid);
		String hasPermissionsJson = om.writeValueAsString(hasPermissoinsList);
		model.addAttribute("hasPermissionsJson", hasPermissionsJson);
		System.out.println(hasPermissionsJson);
		return "jsp/role/grantpermissionsUI";
	}
	
	@RequestMapping("grantPermissions")
	@RequiresPermissions("permission:grant")
	public String grantpermissions(Integer rid, Integer[] pids,Model model) {
		//撤销权限
		rolesService.revokePermissionsFromRoleByRid(rid);
		//分配权限
		rolesService.grantPermissionsToRole(rid, pids);
		return "redirect:/roles/grantPermissionsUI/"+rid;
	}

}
