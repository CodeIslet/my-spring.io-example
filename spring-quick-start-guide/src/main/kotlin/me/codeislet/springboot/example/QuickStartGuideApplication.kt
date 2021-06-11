package me.codeislet.springboot.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootApplication
class QuickStartGuideApplication

fun main(args: Array<String>) {
    runApplication<QuickStartGuideApplication>(*args)
}