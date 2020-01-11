package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.config.LogAnnotation;
import com.woniu.dao.RolesMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import com.woniu.service.RolesService;

@LogAnnotation("角色管理")
@Service
@Transactional
public class RolesServiceImpl implements RolesService {
	
	@Autowired
	private RolesMapper rolesMapper;
	@Override
	@LogAnnotation("删除角色")
	public void delete(@LogAnnotation("  所删除的角色ID：")Integer role_id) {
		// TODO Auto-generated method stub
		rolesMapper.deleteByPrimaryKey(role_id);
	}

	@Override
	@LogAnnotation("增加角色")
	public void save(@LogAnnotation("  新增角色信息：")Roles role) {
		// TODO Auto-generated method stub
		rolesMapper.insertSelective(role);
	}

	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		RolesExample re = new RolesExample();
		re.or().andRoleIdNotEqualTo(-1);
		return rolesMapper.selectByExample(re);
	}

	@Override
	@LogAnnotation("修改角色信息")
	public void update(@LogAnnotation("角色信息：")Roles role) {
		// TODO Auto-generated method stub
		System.out.println(role);
		rolesMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public Roles findById(Integer role_id) {
		// TODO Auto-generated method stub
		Roles role = rolesMapper.selectByPrimaryKey(role_id);
		Subject subject = SecurityUtils.getSubject(); 
		Session session = subject.getSession(); 
		session.setAttribute("RolesServiceImpl_update", role);
		return role;
	}

	@Override
	@LogAnnotation("分配权限")
	public void grantPermissionsToRole(@LogAnnotation("  角色ID：")Integer rid, @LogAnnotation("  拥有的权限ID：")Integer[] pids) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("rid", rid);
		for (Integer pid : pids) {
			map.put("pid", pid);
			rolesMapper.insertr_p(map);
			
		}
	}

	@Override
	public List<Permissions> selectPermissionByRid(Integer rid) {
		// TODO Auto-generated method stub
		List<Permissions> list = rolesMapper.selectPermissionByRid(rid);
		Subject subject = SecurityUtils.getSubject(); 
		Session session = subject.getSession(); 
		session.setAttribute("RolesServiceImpl_grantPermissionsToRole", list);
		return rolesMapper.selectPermissionByRid(rid);
	}

	@Override
	public void revokePermissionsFromRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		rolesMapper.revokePermissionsFromRoleByRid(rid);
	}

}
