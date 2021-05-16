package me.codeislet.springboot.example.jpa.user

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
@EnableJpaAuditing
class AuditingConfiguration {

    @Bean
    fun auditorAware(): AuditorAwareImpl {
        return AuditorAwareImpl()
    }
}