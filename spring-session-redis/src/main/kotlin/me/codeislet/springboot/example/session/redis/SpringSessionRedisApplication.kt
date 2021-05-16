package me.codeislet.springboot.example.session.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class SpringSessionRedisApplication

fun main(args: Array<String>) {
    runApplication<SpringSessionRedisApplication>(*args)
}