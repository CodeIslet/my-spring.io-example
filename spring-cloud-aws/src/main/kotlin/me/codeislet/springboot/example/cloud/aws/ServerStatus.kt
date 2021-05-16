package me.codeislet.springboot.example.cloud.aws

import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
data class ServerStatus(val name: String, val status: Status, val updateAt: LocalDateTime)

enum class Status {
    ACTIVE, MAINTENANCE
}