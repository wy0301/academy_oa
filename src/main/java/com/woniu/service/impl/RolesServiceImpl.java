package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;
import com.woniu.domain.RolesExample;
import com.woniu.service.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {
	
	@Autowired
	private RolesMapper rolesMapper;
	@Override
	public void delete(Integer role_id) {
		// TODO Auto-generated method stub
		rolesMapper.deleteByPrimaryKey(role_id);
	}

	@Override
	public void save(Roles role) {
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
	public void update(Roles role) {
		// TODO Auto-generated method stub
		rolesMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public Roles findById(Integer role_id) {
		// TODO Auto-generated method stub
		return rolesMapper.selectByPrimaryKey(role_id);
	}

	@Override
	public void grantPermissionsToRole(Integer rid, Integer[] pids) {
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
		return rolesMapper.selectPermissionByRid(rid);
	}

	@Override
	public void revokePermissionsFromRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		rolesMapper.revokePermissionsFromRoleByRid(rid);
	}

}
