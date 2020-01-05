package com.woniu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com.woniu" )
@MapperScan("com.woniu.dao")
@EnableAspectJAutoProxy
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}