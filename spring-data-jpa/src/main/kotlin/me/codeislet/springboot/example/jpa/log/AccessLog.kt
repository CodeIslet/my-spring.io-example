package me.codeislet.springboot.example.jpa.log

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
class AccessLog(var hash: String, var content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id : Long? = null

    @CreationTimestamp
    var createdAt : LocalDateTime? = null
}