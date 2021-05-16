package me.codeislet.springboot.example.webflux

import org.junit.jupiter.api.Test
import org.springframework.http.HttpHeaders
import org.springframework.test.web.reactive.server.WebTestClient


/**
 * @author Code Islet
 * @since 0.1.0
 */
class RouterTest {

    private val client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build()

    @Test
    fun getRegionTest() {
        client.get()
            .uri("/regions")
            .header(HttpHeaders.ACCEPT, "application/json")
            .exchange()
            .expectStatus().isOk
    }
}