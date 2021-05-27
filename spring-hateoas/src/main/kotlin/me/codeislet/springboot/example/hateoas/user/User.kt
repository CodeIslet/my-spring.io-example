package me.codeislet.springboot.example.hateoas.user

import org.springframework.hateoas.RepresentationModel


/**
 * @author Code Islet
 * @since 0.1.0
 */
data class User(val name: String, val role: String) : RepresentationModel<User>()