package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PermissionsMapper;
import com.woniu.domain.Permissions;
import com.woniu.domain.PermissionsExample;
import com.woniu.service.PermissionsService;

@Service
@Transactional
public class PermissionsServiceImpl implements PermissionsService {
	
	@Autowired
	private PermissionsMapper permissionsMapper;

	@Override
	public void delete(Integer p_id) {
		// TODO Auto-generated method stub
		permissionsMapper.deleteByPrimaryKey(p_id);
	}

	@Override
	public void update(Permissions perm) {
		// TODO Auto-generated method stub
		permissionsMapper.updateByPrimaryKeySelective(perm);
	}

	@Override
	public void save(Permissions perm) {
		// TODO Auto-generated method stub
		permissionsMapper.insertSelective(perm);
	}

	@Override
	public List<Permissions> findAll() {
		// TODO Auto-generated method stub
		PermissionsExample pe = new PermissionsExample();
		pe.or().andPermissionIdNotEqualTo(-1);
		return permissionsMapper.selectByExample(pe);
	}

	@Override
	public Permissions findById(Integer p_id) {
		// TODO Auto-generated method stub
		return permissionsMapper.selectByPrimaryKey(p_id);
	}

	@Override
	public List<Permissions> getAllPermissionsByRecursion() {
		// TODO Auto-generated method stub
		List<Permissions> allPermissionsList = findAll();
		// 存放最终结果的集合
		List<Permissions> treePermissionList = new ArrayList<>();
		//集合中添加所哟普根节点
		for (Permissions p : allPermissionsList) {
			if(p.getParentId() == 0) {
				treePermissionList.add(p);
			}
		}
		//给根节点添加子节点,递归
		for (Permissions p : treePermissionList) {
			p.setChildren(getChildren(p.getPermissionId(), allPermissionsList));
		}
		return treePermissionList;
	}

	@Override
	public void addPrefixToTreePermissionsList(List<Permissions> treePermissionsList) {
		// TODO Auto-generated method stub
		for (Permissions p : treePermissionsList) {
			addPreifxToChildren(p.getChildren(), "　　");
		}
	}

	@Override
	public List<Permissions> transferTreePermissionsListToFlatPermissionsList(List<Permissions> treePermissionsList) {
		// TODO Auto-generated method stub
		List<Permissions> flatPermissoinsList = new ArrayList<>();
		for (Permissions p : treePermissionsList) {
			flatPermissoinsList.add(p);
			addChildren(p.getChildren(), flatPermissoinsList);
		}
		return flatPermissoinsList;
	}
	
	private List<Permissions> getChildren(Integer pid, List<Permissions> allPermissionsList){
		List<Permissions> children = new ArrayList<>();
		for (Permissions p : allPermissionsList) {
			if(p.getParentId() != 0 && p.getParentId() == pid) {
				children.add(p);
			}
		}
		for (Permissions p : children) {
			p.setChildren(getChildren(p.getPermissionId(), allPermissionsList));
		}
		return children;
	}
	
	private void addPreifxToChildren(List<Permissions> children, String prefix) {
		for (Permissions p : children) {
			p.setPermissionContent(prefix + p.getPermissionContent());
			addPreifxToChildren(p.getChildren(), prefix+"　　");
		}
	}
	
	private void addChildren(List<Permissions> children, List<Permissions> flatPermissoinsList) {
		for (Permissions p : children) {
			flatPermissoinsList.add(p);
			addChildren(p.getChildren(), flatPermissoinsList);
		}
	}

}
