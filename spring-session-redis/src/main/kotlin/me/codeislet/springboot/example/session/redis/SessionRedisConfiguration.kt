package me.codeislet.springboot.example.session.redis

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
@EnableRedisHttpSession
class SessionRedisConfiguration {

    @Bean
    fun connectionFactory(): LettuceConnectionFactory {
        return LettuceConnectionFactory()
    }
}