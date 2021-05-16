package me.codeislet.springboot.example.webflux.region

import org.springframework.data.r2dbc.repository.R2dbcRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface RegionRepository : R2dbcRepository<Region, String>