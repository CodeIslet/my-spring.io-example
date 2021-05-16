package me.codeislet.springboot.example

import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.TestConstructor
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


/**
 * @author Code Islet
 * @since 0.1.0
 */
@WebMvcTest
@AutoConfigureMockMvc
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class HelloControllerTest(val mockMvc: MockMvc) {

    @Test
    fun `assert say hello`() {
        mockMvc
            .perform(MockMvcRequestBuilders.get("/hello?name=Jane").accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(CoreMatchers.equalTo("Hello Jane!")))
    }
}