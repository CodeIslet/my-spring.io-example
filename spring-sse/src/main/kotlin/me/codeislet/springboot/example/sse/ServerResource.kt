package me.codeislet.springboot.example.sse

import java.time.LocalDateTime

/**
 * @author Code Islet
 * @since 0.1.0
 */
data class ServerResource(val cpuLoad: Double, val totalMem: Long, val freeMem: Long, val time: LocalDateTime)