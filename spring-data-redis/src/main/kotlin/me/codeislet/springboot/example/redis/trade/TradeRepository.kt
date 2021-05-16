package me.codeislet.springboot.example.redis.trade

import org.springframework.data.repository.CrudRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface TradeRepository : CrudRepository<Trade, Long>