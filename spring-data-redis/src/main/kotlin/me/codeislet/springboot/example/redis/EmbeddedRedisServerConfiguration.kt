package me.codeislet.springboot.example.redis

import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Configuration
import redis.embedded.RedisServer
import java.util.*


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class EmbeddedRedisServerConfiguration(val redisProperties: RedisProperties) : InitializingBean, DisposableBean {

    lateinit var redisServer : RedisServer

    override fun destroy() {
        Optional.ofNullable(redisServer).ifPresent(RedisServer::stop)
    }

    override fun afterPropertiesSet() {
        redisServer = RedisServer(redisProperties.port)
        redisServer.start()
    }
}