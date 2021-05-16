package me.codeislet.springboot.example.jpa.user

import org.springframework.data.domain.AuditorAware
import java.util.*


/**
 * @author Code Islet
 * @since 0.1.0
 */
class AuditorAwareImpl : AuditorAware<User> {

    private var auditor : Optional<User> = Optional.empty()

    fun setAuditor(auditor : User) {
        this.auditor = Optional.of(auditor)
    }

    override fun getCurrentAuditor(): Optional<User> {
        return this.auditor
    }
}