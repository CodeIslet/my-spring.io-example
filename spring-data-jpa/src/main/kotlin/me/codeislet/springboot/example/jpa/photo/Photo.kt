package me.codeislet.springboot.example.jpa.photo

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Entity
class Photo(var name: String, var size: Long, var path: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id : Long? = null

    var createdAt : LocalDateTime? = null

    @CreationTimestamp
    fun onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now()
        }
    }
}