package com.woniu.service;

import java.util.List;
import java.util.Map;

import com.woniu.domain.Emps;
import com.woniu.domain.Roles;

public interface EmpsService {
	void save(Emps e);
	void delete(Integer eid);
	void update(Emps e);
	Emps find(Integer eid);
	Emps findByOaCount(String count);
	List<Emps> find();
	List<Roles> findRolesByEmpID(Integer eid);
	void removeRolesByEid(Integer eid);
	void grantRolesByEid(Integer eid,Integer[] roles);
	Emps findEmp(String oaAccount);
}
