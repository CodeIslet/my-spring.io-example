package me.codeislet.springboot.example.openfeign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


/**
 * @author Code Islet
 * @since 0.1.0
 */
@FeignClient(value = "server", url = "http://\${server.address}:\${server.port}/server")
interface GreetingClient {

    @GetMapping("/greeting/{name}")
    fun greeting(@PathVariable(value = "name") name : String) : Greeting
}