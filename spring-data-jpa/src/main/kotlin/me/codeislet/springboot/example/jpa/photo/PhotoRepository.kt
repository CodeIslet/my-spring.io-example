package me.codeislet.springboot.example.jpa.photo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface PhotoRepository : JpaRepository<Photo, Long> {

    fun findTopByName(name: String) : Photo

    @Query("SELECT p FROM Photo p WHERE p.createdAt >= :start AND p.createdAt <= :end")
    fun findByCreatedAtBetween(start: LocalDateTime, end: LocalDateTime) : List<Photo>
}