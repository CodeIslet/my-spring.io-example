package me.codeislet.springboot.example.openfeign

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
class GreetingClientTest(val greetingClient: GreetingClient) {

    @Test
    fun `greeting client test`() {
        val greeting = greetingClient.greeting("Endo")
        assertEquals("Endo", greeting.name)
        assertNotNull(greeting.time)
    }
}