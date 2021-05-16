package me.codeislet.springboot.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/greet")
class GreetingController {

    data class Greeting(val id : Long, val name : String)

    private val template = "Hello, %s!"
    private val counter = AtomicLong()

    @GetMapping
    fun greeting(@RequestParam(value = "name", required = true, defaultValue = "World") name : String) : Greeting {
        return Greeting(counter.incrementAndGet(), String.format(template, name))
    }
}