package me.codeislet.springboot.example.openfeign

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class OpenFeignHeaderConfiguration : RequestInterceptor {

    override fun apply(template: RequestTemplate) {
        template.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
    }
}