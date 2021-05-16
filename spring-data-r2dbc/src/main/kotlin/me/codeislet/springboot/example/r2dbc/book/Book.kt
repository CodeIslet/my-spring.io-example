package me.codeislet.springboot.example.r2dbc.book

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Table("book")
class Book(@Id var id: Long?, var title: String, var author: String, var publicationAt: LocalDateTime)