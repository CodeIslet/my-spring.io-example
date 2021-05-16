package me.codeislet.springboot.example.r2dbc.store

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Table("store")
data class Store(@Id var id: Long?, var name: String, var address: String)