package me.codeislet.springboot.example.sse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class SpringSSEApplication

fun main(args: Array<String>) {
    runApplication<SpringSSEApplication>(*args)
}