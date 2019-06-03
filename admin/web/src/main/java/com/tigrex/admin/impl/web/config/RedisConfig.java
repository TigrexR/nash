package com.tigrex.admin.impl.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author linus
 */
@Configuration
@EnableRedisHttpSession
public class RedisConfig {
}
