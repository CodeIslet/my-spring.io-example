package me.codeislet.springboot.example.sse

import org.springframework.http.codec.ServerSentEvent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/server")
class ResourceController(val serverResourceService: ServerResourceService) {

    @GetMapping("/resource")
    fun getResource(): Flux<ServerSentEvent<ServerResource>> {
        return Flux.interval(Duration.ofSeconds(1))
                .map {
                    ServerSentEvent.builder(serverResourceService.getResource()).build()
                }
    }
}