package com.code16.springjavaedu.sixthweek.saturday.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class RedisConfiguration {

	@Value(value = "${redis.server.port}")
	private int redisServerPort;

	@Value(value = "${redis.server.address}")
	private String redisServerAddress;

	@Primary
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setKeySerializer(RedisSerializer.string());
		template.setValueSerializer(RedisSerializer.json());
		template.setHashValueSerializer(RedisSerializer.json());
		template.setHashKeySerializer(RedisSerializer.string());
		template.setConnectionFactory(redisConnectionFactory());
		return template;
	}

	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory(redisConnection());
	}

	private RedisStandaloneConfiguration redisConnection() {
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(redisServerAddress, redisServerPort);

		return configuration;
	}

	@Bean("cManager")
	@Primary
	public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
		return RedisCacheManager.create(connectionFactory);
	}


	@Bean("defaultCacheManager")
	public CacheManager defaultCacheManager() {
		return new ConcurrentMapCacheManager();
	}
}
