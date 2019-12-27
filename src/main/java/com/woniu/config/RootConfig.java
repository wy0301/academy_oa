package com.woniu.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class RootConfig {
	@Bean
	public DruidDataSource ds() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://192.168.9.233:3306/oa?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(ds());
		realm.setAuthenticationQuery("select oa_password, salt from emps where oa_account = ?");
		realm.setUserRolesQuery("SELECT rname FROM emp_role er JOIN emps e ON er.`emp_id` = e.`emp_id` JOIN roles r ON er.`role_id` = r.`role_id` WHERE oa_account = ?");
		realm.setPermissionsQuery("SELECT permission_content FROM role_permission rp JOIN roles r ON rp.role_id = r.`role_id` JOIN permissions p ON rp.permission_id = p.permission_id WHERE rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}
	
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}
	
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean sffb = new ShiroFilterFactoryBean();
		sffb.setLoginUrl("/login.jsp");
		sffb.setUnauthorizedUrl("/exceptionResolver/unauthorized.jsp");
		sffb.setSecurityManager(securityManager());
		
		
		Map<String, String> map = new HashMap<>();
		map.put("/logout", "logout");
		map.put("/login.jsp", "anon");
		map.put("/users/login", "anon");
		map.put("/**", "authc");
		
		sffb.setFilterChainDefinitionMap(map);
		
		return sffb;
	}
	
	@Bean
	public AuthorizationAttributeSourceAdvisor aasa() {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}
}
