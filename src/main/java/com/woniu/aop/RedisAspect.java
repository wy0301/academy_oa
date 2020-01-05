package com.woniu.aop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
@Aspect
public class RedisAspect {

	@Autowired
	private JedisPool pool;
//返回值为不是void的方法基本是查询方法，除了极个别方法
	@Around("execution(!void com.woniu.service.*.*(..))&&" + "!execution(* getAllPermissionsByRecursion(..))&&"
			+ "!execution(* transferTreePermissionsListToFlatPermissionsList(..))")
	public Object selectAspect(ProceedingJoinPoint pjp) {
		ObjectMapper om = new ObjectMapper();
		// 获取目标对象
		Object target = pjp.getTarget();
		// 拼接redis键中存放的内容：类名+方法名+入参
		StringBuffer key = new StringBuffer();
		key.append(target.getClass().getSimpleName());
		key.append("_");
		key.append(pjp.getSignature().getName());
		key.append("_");
		key.append(Arrays.toString(pjp.getArgs()));
		Object obj = null;
		Jedis jedis = null;
		try {
			Boolean b = false;
			Boolean bb = true;
			//如果redis服务器出现异常，则直接放行 
			try {
				jedis = pool.getResource();
				b = jedis.exists(key.toString());
			} catch (Exception e) {
				e.printStackTrace();
				bb = false;
			}
			if (b) {
				String json = jedis.get(key.toString());
				// ((MethodSignature)pjp.getSignature()).getReturnType()为获取切面方法返回值类型
				obj = om.readValue(json, ((MethodSignature) pjp.getSignature()).getReturnType());
				// System.out.println(obj);
			} else {
				obj = pjp.proceed();
				//bb为true说明redis服务器正常，则存入键值
				if(bb) {
				String json = om.writeValueAsString(obj);
				jedis.set(key.toString(), json);
				}
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jedis.close();
		}
		return obj;
	}
//返回值为void的方法为增删改方法，除了个别方法
	@Around("execution(void com.woniu.service.*.*(..))&&" + "!execution(* addPrefixToTreePermissionsList(..))")
	public void clearAspect(ProceedingJoinPoint pjp) {
		Jedis jedis = null;
		try {
			pjp.proceed();
			Object target = pjp.getTarget();
			jedis = pool.getResource();
			String className = target.getClass().getSimpleName();
			// 获取所有已该雷类名为开头的键
			Set<String> set = jedis.keys(className + "*");
			// 遍历删除这些键值
			if (set.size() != 0) {
				Iterator<String> iterator = set.iterator();
				while (iterator.hasNext()) {
					jedis.del(iterator.next());
				}
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jedis.close();
		}
	}
}
