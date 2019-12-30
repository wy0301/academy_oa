package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.domain.Permissions;
import com.woniu.service.PermissionsService;

@RequestMapping("permissions")
@Controller
public class PermissionsController {

	@Autowired
	private PermissionsService permissionsService;

	@RequestMapping("findAll")
	@RequiresPermissions("permissions:select")
	public String findAll(Model model) throws JsonProcessingException {
		List<Permissions> list = permissionsService.findAll();
		ObjectMapper om = new ObjectMapper();
		String treejson = om.writeValueAsString(list);
		model.addAttribute("treejson", treejson);
		System.out.println(treejson);
		return "jsp/permission/permissionsUI";
	}

	@RequestMapping("saveUI")
	@RequiresPermissions("permissions:save")
	public String saveUI(Model model) {
		List<Permissions> tree = permissionsService.getAllPermissionsByRecursion();

		permissionsService.addPrefixToTreePermissionsList(tree);

		List<Permissions> flatList = permissionsService.transferTreePermissionsListToFlatPermissionsList(tree);

		model.addAttribute("list", flatList);
		return "jsp/permission/addpermission";
	}
	
	@RequestMapping("save")
	@RequiresPermissions("permissions:save")
	public String save(Permissions p) {
		permissionsService.save(p);
		return "redirect:/permissions/findAll";
	}
	
	@RequestMapping("delete/{pid}")
	@RequiresPermissions("permissions:delete")
	public String delete(@PathVariable Integer pid) {
		permissionsService.delete(pid);
		return "redirect:/permissions/findAll";
	}
	
	@RequiresPermissions("permissions:select")
	@RequestMapping("updateUI/{pid}")
	public String updateUI(@PathVariable Integer pid, Model model) {
		Permissions p = permissionsService.findById(pid);
		model.addAttribute("permissions", p);
		return "updateUI";
	}
	
	@RequiresPermissions("permissions:update")
	@RequestMapping("update")
	public String update(Permissions p) {
		permissionsService.update(p);
		return "redirect:/permissions/findAll";
	}
}
