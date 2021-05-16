package me.codeislet.springboot.example.openfeign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients


/**
 * @author Code Islet
 * @since 0.1.0
 */
@EnableFeignClients
@SpringBootApplication
class SpringCloudOpenfeignApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudOpenfeignApplication>(*args)
}