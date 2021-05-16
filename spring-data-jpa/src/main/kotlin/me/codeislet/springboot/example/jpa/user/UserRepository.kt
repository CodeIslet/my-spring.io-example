package me.codeislet.springboot.example.jpa.user

import org.springframework.data.repository.CrudRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface UserRepository : CrudRepository<User, Long>