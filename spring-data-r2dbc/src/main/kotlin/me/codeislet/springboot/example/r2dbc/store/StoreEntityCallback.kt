package me.codeislet.springboot.example.r2dbc.store

import org.reactivestreams.Publisher
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.mapping.event.BeforeConvertCallback
import org.springframework.data.relational.core.sql.SqlIdentifier
import reactor.core.publisher.Mono


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Configuration
class StoreEntityCallback : BeforeConvertCallback<Store> {

    override fun onBeforeConvert(p0: Store, p1: SqlIdentifier): Publisher<Store> {
        p0.name = p0.name.toUpperCase().replace(" ", "_")
        return Mono.just(p0)
    }
}