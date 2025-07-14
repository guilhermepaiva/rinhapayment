package com.paiva.com.rinha.routes


import com.paiva.rinha.model.PaymentRequest
import com.paiva.rinha.model.PaymentResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.http.*


fun Route.paymentRoutes() {
    post("/payments") {
        val request = call.receive<PaymentRequest>()
        // Aqui no futuro vamos fazer a chamada para os processadores
        println("Recebido pagamento: ${request.correlationId} - R$${request.amount}")
        call.respond(HttpStatusCode.OK, PaymentResponse("Pagamento Recebido"))
    }
}

