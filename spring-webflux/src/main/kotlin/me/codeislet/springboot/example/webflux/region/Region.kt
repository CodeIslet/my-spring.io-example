package me.codeislet.springboot.example.webflux.region

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Entity
data class Region(@Id var id: String, var name: String, var description: String,
                  @CreationTimestamp var createdAt: LocalDateTime? = null) {
}