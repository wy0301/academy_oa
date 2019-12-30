package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;
import com.woniu.domain.Roles;

public interface RolesService {

	void delete(Integer role_id);
	void save(Roles role);
	List<Roles> findAll();
	void update(Roles role);
	Roles findById(Integer role_id);
	
	void grantPermissionsToRole(Integer rid, Integer[] pids);
	
	List<Permissions> selectPermissionByRid(Integer rid);
	
	void revokePermissionsFromRoleByRid(Integer rid);
}
