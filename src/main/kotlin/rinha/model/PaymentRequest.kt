package com.paiva.rinha.model

import kotlinx.serialization.Serializable

@Serializable
data class PaymentRequest(
    val correlationId: String,
    val amount: Double
)