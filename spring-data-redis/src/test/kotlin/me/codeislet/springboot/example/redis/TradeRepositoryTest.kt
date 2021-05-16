package me.codeislet.springboot.example.redis

import me.codeislet.springboot.example.redis.trade.Trade
import me.codeislet.springboot.example.redis.trade.TradeRepository
import me.codeislet.springboot.example.redis.trade.Trader
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class TradeRepositoryTest(val tradeRepository: TradeRepository) {

    @Test
    fun `assert cached data`() {
        val tradeId = 1L
        val trader = Trader("James", "james@mail.com")
        tradeRepository.save(Trade(tradeId, trader, 2100, 13, LocalDateTime.now()))

        val trade = tradeRepository.findById(tradeId).orElseThrow()
        assertEquals(tradeId, trade.id)
        assertEquals(trader.name, trade.trader.name)
        assertEquals(2100, trade.price)
        assertNotNull(trade.time)
    }
}