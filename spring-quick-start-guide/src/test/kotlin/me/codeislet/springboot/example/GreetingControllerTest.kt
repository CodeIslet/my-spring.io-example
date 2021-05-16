package me.codeislet.springboot.example

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.TestConstructor
import org.springframework.test.web.client.match.MockRestRequestMatchers
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import javax.management.Query


/**
 * @author Code Islet
 * @since 0.1.0
 */
@WebMvcTest
@AutoConfigureMockMvc
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class GreetingControllerTest(val mockMvc : MockMvc) {

    @Test
    fun `assert greeting`() {
        mockMvc
            .perform(MockMvcRequestBuilders.get("/greet?name=Tony").accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect {
                MockRestRequestMatchers.jsonPath("$[0].name", { Query.value("Tony") })
            }
    }
}