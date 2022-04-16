package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.sessions.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/hello") {
            call.respondText("Hello World!\n${call.sessions.get<UserSession>()?.accessToken}")
        }
    }
}
