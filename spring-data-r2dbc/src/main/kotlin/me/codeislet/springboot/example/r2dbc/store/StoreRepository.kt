package me.codeislet.springboot.example.r2dbc.store

import org.springframework.data.repository.reactive.ReactiveCrudRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface StoreRepository : ReactiveCrudRepository<Store, Long>