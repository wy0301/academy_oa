package com.woniu.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.SyslogMapper;
import com.woniu.domain.Syslog;
import com.woniu.domain.SyslogExample;
import com.woniu.service.SyslogService;

@Transactional
@Service
public class SyslogServiceImpl implements SyslogService {

	@Autowired
	private SyslogMapper mapper;
	@Override
	public List<Syslog> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public List<Syslog> findByDate(String date) {
		// TODO Auto-generated method stub
		SyslogExample example = new SyslogExample();
		example.or().andOpTimeBetween(new Date(), new Date());
		return null;
	}

	@Override
	public void save(Syslog log) {
		// TODO Auto-generated method stub
		mapper.insertSelective(log);
	}

}
