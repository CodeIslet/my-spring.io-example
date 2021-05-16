package me.codeislet.springboot.example.webflux

import me.codeislet.springboot.example.webflux.region.RegionHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class RouterConfiguration {

    @Bean
    fun regionRouter(regionHandler: RegionHandler) = coRouter {

        "/regions".nest {
            GET("/{id}", regionHandler::getRegion)
            GET("", regionHandler::getRegions)
        }
    }
}