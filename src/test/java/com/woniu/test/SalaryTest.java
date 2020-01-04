package com.woniu.test;

import java.io.File;
import java.util.List;

import com.woniu.domain.Sal;
import com.woniu.service.SalaryService;
import com.woniu.service.impl.SalaryServiceImpl;

public class SalaryTest {
	public static void main(String[] args) {
		SalaryService ss=new SalaryServiceImpl();
		List<Sal> list = ss.findSalToEmpToDept(2019, 1);
		for (Sal sal : list) {
			System.out.println(sal);
		}
	}
}
