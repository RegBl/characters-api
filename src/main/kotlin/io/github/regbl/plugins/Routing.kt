package io.github.regbl.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.github.regbl.routes.characterRouting

fun Application.configureRouting() {
    routing {
        characterRouting()
    }
}
