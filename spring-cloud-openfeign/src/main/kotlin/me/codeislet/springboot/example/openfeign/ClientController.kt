package me.codeislet.springboot.example.openfeign

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/client")
class ClientController(val greetingClient: GreetingClient) {

    @GetMapping("/greeting")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun greeting() : Greeting {
        return greetingClient.greeting("Hanna")
    }
}