package regbl.github.io.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.characterRouting() {
    route("/character") {
        get {
            call.respondText("Hello, world!")
        }
        get("/svtpk") {
            TODO("Add handling from Save vs Total Party Kill")
        }
    }
}