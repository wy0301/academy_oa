package com.woniu.service;

import java.util.List;

import com.woniu.domain.Syslog;

public interface SyslogService {

	List<Syslog> findAll();
	List<Syslog> findByDate(String date);
	void save(Syslog log);
}
