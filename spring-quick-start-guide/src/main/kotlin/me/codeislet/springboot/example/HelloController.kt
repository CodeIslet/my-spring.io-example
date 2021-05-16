package me.codeislet.springboot.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun sayHello(@RequestParam(value = "name", required = true) name: String) : String {
        return String.format("Hello %s!", name)
    }
}