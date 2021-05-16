package me.codeislet.springboot.example.redis

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
@ConfigurationProperties(prefix = "redis")
class RedisProperties {
    lateinit var host: String
    var port: Int = 0
    var database: Int = 0
}