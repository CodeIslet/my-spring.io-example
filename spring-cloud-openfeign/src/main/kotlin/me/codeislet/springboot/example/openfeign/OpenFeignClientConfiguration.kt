package me.codeislet.springboot.example.openfeign

import feign.Retryer
import org.springframework.cloud.openfeign.FeignFormatterRegistrar
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class OpenFeignClientConfiguration {

    @Bean
    fun dateTimeFormatterRegister() : FeignFormatterRegistrar {
        return FeignFormatterRegistrar {
            fun registerFormatters(formatterRegistry: FormatterRegistry) {
                val registrar : DateTimeFormatterRegistrar = DateTimeFormatterRegistrar()
                registrar.setUseIsoFormat(true)
                registrar.registerFormatters(formatterRegistry)
            }
        }
    }

    @Bean
    fun retryer() : Retryer {
        return Retryer.Default(1000, 2000, 3)
    }
}