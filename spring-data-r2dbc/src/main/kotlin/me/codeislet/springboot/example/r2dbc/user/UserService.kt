package me.codeislet.springboot.example.r2dbc.user

import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.relational.core.query.Criteria.where
import org.springframework.data.relational.core.query.Query.query
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Service
class UserService(val r2dbcEntityTemplate: R2dbcEntityTemplate) {

    fun saveUser(user: User) : Mono<User> {
        return r2dbcEntityTemplate.insert(user)
    }

    fun findByName(name: String) : Flux<User> {
        return r2dbcEntityTemplate.select(query(where("name").`is`(name)), User::class.java)
    }
}