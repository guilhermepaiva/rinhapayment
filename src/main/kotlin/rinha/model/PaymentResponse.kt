package com.paiva.rinha.model

import kotlinx.serialization.Serializable

@Serializable
data class PaymentResponse(
    val message: String
)