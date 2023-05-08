package regbl.github.io.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import regbl.github.io.routes.characterRouting

fun Application.configureRouting() {
    routing {
        characterRouting()
    }
}
