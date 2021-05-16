package me.codeislet.springboot.example.r2dbc.user

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Table("user")
data class User(@Id val id: Long?, val name: String, val birth: Int)