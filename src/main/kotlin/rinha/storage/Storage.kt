package com.paiva.rinha.storage

import com.paiva.rinha.model.PaymentRequest
import java.util.concurrent.CopyOnWriteArrayList

data class ProcessedPayment(
    val payment: PaymentRequest,
    val processor: String // "default" ou "fallback"
)

object Storage {
    val payments = CopyOnWriteArrayList<ProcessedPayment>()
}