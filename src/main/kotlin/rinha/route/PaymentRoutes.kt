package com.paiva.rinha.route

import com.paiva.rinha.model.PaymentRequest
import com.paiva.rinha.model.PaymentResponse
import com.paiva.rinha.model.Summary
import com.paiva.rinha.storage.ProcessedPayment
import com.paiva.rinha.storage.Storage
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.paymentRoutes() {
    post("/payments") {
        val request = call.receive<PaymentRequest>()

        // Aqui ainda estamos simulando que o processador default sempre é usado.
        Storage.payments.add(ProcessedPayment(request, "default"))

        call.respond(HttpStatusCode.OK, PaymentResponse("Pagamento Recebido"))
    }

    get("/payments-summary") {
        val grouped = Storage.payments.groupBy { it.processor }

        val default = grouped["default"] ?: emptyList()
        val fallback = grouped["fallback"] ?: emptyList()

        val summary = Summary(
            defaultCount = default.size,
            defaultTotal = default.sumOf { it.payment.amount },
            fallbackCount = fallback.size,
            fallbackTotal = fallback.sumOf { it.payment.amount }
        )

        call.respond(HttpStatusCode.OK, summary)
    }
}

