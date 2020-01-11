package com.woniu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
	@Bean
	public JedisPool redisPoolFactory() throws Exception{
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		JedisPool jedisPool = new JedisPool(jedisPoolConfig,"192.168.9.233",6379,200);
		return jedisPool;
	}
}
