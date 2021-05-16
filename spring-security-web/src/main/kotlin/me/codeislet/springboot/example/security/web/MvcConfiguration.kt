package me.codeislet.springboot.example.security.web

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class MvcConfiguration : WebMvcConfigurer {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/index").setViewName("index")
        registry.addViewController("/").setViewName("index")
        registry.addViewController("/hello").setViewName("hello")
        registry.addViewController("/login").setViewName("login")
    }
}