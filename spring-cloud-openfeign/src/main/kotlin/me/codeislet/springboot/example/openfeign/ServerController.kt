package me.codeislet.springboot.example.openfeign

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/server")
class ServerController {

    @GetMapping("/greeting/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun greeting(@PathVariable(name = "name", required = true) name : String) : Greeting {
        return Greeting(name, LocalDateTime.now())
    }
}