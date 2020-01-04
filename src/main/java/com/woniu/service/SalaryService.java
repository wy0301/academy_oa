package com.woniu.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.Sal;

public interface SalaryService {
	void importSalary(MultipartFile file);
	
	Sal findSal(Integer empId,Integer year,Integer month);
	List<Sal> findSalToEmpToDept(Integer year,Integer month);
}
