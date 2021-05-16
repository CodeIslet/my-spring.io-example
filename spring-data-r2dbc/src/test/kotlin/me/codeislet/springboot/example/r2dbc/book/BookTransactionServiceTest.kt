package me.codeislet.springboot.example.r2dbc.book

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import reactor.test.StepVerifier
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class BookTransactionServiceTest(val bookTransactionService: BookTransactionService,
                                 val bookRepository: BookRepository) {

    @Test
    fun `expect rollback`() {
        val publicationAt = LocalDateTime.of(2030, 1, 2, 13, 12)
        val book = Book(null, "Just for fun", "Linus Torvalds", publicationAt)
        bookTransactionService.save(book)!!.`as`(StepVerifier::create).expectError().verify()

        bookRepository.findByTitle(book.title).`as`(StepVerifier::create).verifyComplete()
    }
}