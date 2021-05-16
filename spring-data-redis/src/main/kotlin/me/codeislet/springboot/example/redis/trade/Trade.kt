package me.codeislet.springboot.example.redis.trade

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RedisHash("Trade")
data class Trade(@Id val id: Long, val trader: Trader, val price: Long, val volume: Long, val time: LocalDateTime)