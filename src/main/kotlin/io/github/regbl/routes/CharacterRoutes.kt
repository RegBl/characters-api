package io.github.regbl.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.github.regbl.models.getDefaultCharacter

fun Route.characterRouting() {
    route("/") {
        get {
            call.respondRedirect("/character")
        }
    }
    route("/character") {
        get {
            // return Character.getDefaultCharacter()
            call.respond(getDefaultCharacter())
        }
        get("/svtpk") {
            TODO("Add handling from Save vs Total Party Kill")
        }
    }
}