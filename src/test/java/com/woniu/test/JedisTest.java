package com.woniu.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	@Test
	public void test1() {
		Jedis jedis = new Jedis("192.168.9.233",6379);
		System.out.println(jedis.keys("F*"));
	} 
}
