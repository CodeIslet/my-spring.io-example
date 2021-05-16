package me.codeislet.springboot.example.security.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class SpringSecurityWebApplication

fun main(args: Array<String>) {
    runApplication<SpringSecurityWebApplication>(*args)
}