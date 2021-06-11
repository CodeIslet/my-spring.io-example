package me.codeislet.springboot.example.sse

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Controller
class WebPageController {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }
}