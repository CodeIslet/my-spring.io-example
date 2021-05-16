package me.codeislet.springboot.example.redis

import me.codeislet.springboot.example.redis.stock.Stock
import me.codeislet.springboot.example.redis.stock.StockCache
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class StockCacheTest(val stockCache: StockCache) {

    @Test
    fun `generate cache key`() {
        assertEquals("STOCK:1", StockCache.generateCacheKey(1))
    }

    @Test
    fun `assert cached data`() {
        val stock = Stock(5930, "SAMSUNG", "KR")
        stockCache.set(StockCache.generateCacheKey(stock.code), stock)

        val saved : Stock? = stockCache.get(StockCache.generateCacheKey(stock.code))
        assertNotNull(saved)

        saved?.let {
            assertEquals(stock.code, it.code)
            assertEquals(stock.name, it.name)
            assertEquals(stock.region, it.region)
        }
    }
}