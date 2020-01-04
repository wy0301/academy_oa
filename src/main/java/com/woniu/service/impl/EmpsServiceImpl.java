package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.EmpsMapper;
import com.woniu.domain.Emps;
import com.woniu.domain.EmpsExample;
import com.woniu.domain.Roles;
import com.woniu.service.EmpsService;


@Service
@Transactional
public class EmpsServiceImpl implements EmpsService {
	@Autowired
	private EmpsMapper mapper;
	
	@Override
	public void save(Emps e) {
		// TODO Auto-generated method stub
		mapper.insertSelective(e);
	}

	@Override
	public void delete(Integer eid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(eid);
	}

	@Override
	public void update(Emps e) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(e);
	}

	@Override
	public Emps find(Integer eid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(eid);
	}

	@Override
	public List<Emps> find() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public List<Roles> findRolesByEmpID(Integer eid) {
		// TODO Auto-generated method stub
		return mapper.findRolesByEmpID(eid);
	}

	@Override
	public void removeRolesByEid(Integer eid) {
		// TODO Auto-generated method stub
		mapper.removeRolesByEid(eid);
	}

	@Override
	public void grantRolesByEid(Integer eid,Integer[] roles) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("eid", eid);
		for(Integer rid:roles) {
			map.put("rid", rid);
			mapper.grantRolesByEid(map);
		}
	}

	@Override
	public Emps findByOaCount(String count) {
		// TODO Auto-generated method stub
		EmpsExample ee = new EmpsExample();
		ee.or().andOaAccountEqualTo(count);
		return mapper.selectByExample(ee).get(0);
	}

}
