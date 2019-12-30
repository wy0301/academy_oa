package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;

public interface PermissionsService {

	void delete(Integer p_id);
	void update(Permissions perm);
	void save(Permissions perm);
	List<Permissions> findAll();
	Permissions findById(Integer p_id);
	
	//以树的形式返回结果
	List<Permissions> getAllPermissionsByRecursion();
	//按层次给权限添加前缀
	void addPrefixToTreePermissionsList(List<Permissions> treePermissionsList);
	//把树状权限转换为平级的集合
	List<Permissions> transferTreePermissionsListToFlatPermissionsList(List<Permissions> treePermissionsList);
	
}
