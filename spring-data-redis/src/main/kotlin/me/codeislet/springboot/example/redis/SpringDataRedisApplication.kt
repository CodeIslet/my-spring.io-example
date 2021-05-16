package me.codeislet.springboot.example.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class SpringDataRedisApplication

fun main(args: Array<String>) {
    runApplication<SpringDataRedisApplication>(*args)
}