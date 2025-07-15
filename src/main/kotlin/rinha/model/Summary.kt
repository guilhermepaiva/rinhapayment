package com.paiva.rinha.model

import kotlinx.serialization.Serializable

@Serializable
data class Summary(
    val defaultCount: Int,
    val defaultTotal: Double,
    val fallbackCount: Int,
    val fallbackTotal: Double
)