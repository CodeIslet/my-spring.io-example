package me.codeislet.springboot.example.openfeign

import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
data class Greeting(val name: String, val time: LocalDateTime)