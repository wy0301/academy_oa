package com.woniu.service;

import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.ExtraIncome;

public interface ExtraIncomeService {

	void delete(Integer year,Integer month,Integer eid);
	void save(MultipartFile file,ExtraIncome ei);
	ExtraIncome findSelective(Integer year,Integer month,Integer eid);
	ExtraIncome findLatest(Integer eid);
}
