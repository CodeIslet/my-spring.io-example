package me.codeislet.springboot.example.jpa.album

import org.springframework.data.jpa.repository.JpaRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface AlbumRepository : JpaRepository<Album, Long>