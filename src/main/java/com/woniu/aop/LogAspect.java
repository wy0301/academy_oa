package com.woniu.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.woniu.config.LogAnnotation;
import com.woniu.domain.Syslog;
import com.woniu.service.EmpsService;
import com.woniu.service.SyslogService;

@Component
@Aspect
public class LogAspect {

	@Autowired
	private EmpsService service;
	@Autowired
	private SyslogService logService;

	@Around("@annotation(com.woniu.config.LogAnnotation)")
	public void logAspect(ProceedingJoinPoint pjp) {
		// 获取操作开始时间
		long startTime = System.currentTimeMillis();
		// 表示操作最终是否成功
		Boolean flag = true;
		try {
			// 放行
			pjp.proceed();
			// 获取操作结束时间
			long endTime = System.currentTimeMillis();
			// 获取操作持续时间
			BigDecimal duration = new BigDecimal(endTime - startTime);
			// 获取目标对象
			Object target = pjp.getTarget();
			// 获取类注解中存放的操作模块名称
			String module = target.getClass().getAnnotation(LogAnnotation.class).value();
			// 获取方法注解中存放的操作名称
			Signature signature = pjp.getSignature();
			MethodSignature msg = (MethodSignature) signature;
			Method method = null;
			try {
				method = target.getClass().getMethod(msg.getName(), msg.getParameterTypes());
			} catch (NoSuchMethodException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String opType = method.getAnnotation(LogAnnotation.class).value();
			// 获取session中存放的执行修改操作前的信息（例如执行findByID方法后会将类名+方法名作为键，查询到的数据作为值）
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession();
			// 获取IP地址
			String ip = session.getHost();
			// 获取操作人
			String oaCount = (String) SecurityUtils.getSubject().getPrincipal();
			Integer empId = service.findByOaCount(oaCount).getEmpId();
			Object objPre = session.getAttribute(target.getClass().getSimpleName() + "_" + method.getName());
			Object objAfter = null;
			Parameter[] params = method.getParameters();
			StringBuffer optContent = new StringBuffer();
			// 判断session中是否存有修改前数据，如果有，那么这就是一个修改操作！
			if (objPre != null)
				optContent.append(objPre).append("修改为：");
			for (int i = 0; i < params.length; i++) {
				if (params[i].isAnnotationPresent(LogAnnotation.class)) {
					optContent.append(params[i].getAnnotation(LogAnnotation.class).value());
					objAfter = pjp.getArgs()[i];
					if (objAfter.getClass() == new Integer[] {}.getClass()) {
						optContent.append(Arrays.asList((Integer[]) objAfter));
					} else {
						optContent.append(objAfter);
					}
				}
			}
			Syslog log = new Syslog();
			log.setIp(ip);
			log.setOpContent(optContent.toString());
			log.setOpDuration(duration);
			log.setOpEmp(empId);
			log.setOpModule(module);
			log.setOpTime(new Date(startTime));
			log.setOpType(opType);
			System.out.println(log);
			logService.save(log);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			flag = false;
			e.printStackTrace();
		} finally {
			System.out.println(flag);
		}
	}
}
