package me.codeislet.springboot.example.r2dbc.book

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Mono
import java.lang.IllegalStateException
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Service
class BookTransactionService(val bookRepository: BookRepository) {

    @Transactional
    fun save(book: Book) : Mono<Book>? {
        return bookRepository.save(book).map {
            if (it.publicationAt.isAfter(LocalDateTime.now())) {
                throw IllegalStateException()
            }
            it
        }
    }
}