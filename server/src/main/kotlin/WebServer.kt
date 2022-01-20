import io.ktor.application.*
import io.ktor.html.*
import io.ktor.routing.*
import kotlinx.html.*

@Suppress("unused")
fun Application.module() {
    routing {
        get("{...}") {
            call.respondHtml {
                body {
                    div {
                        id = "react-app"
                        +"Waiting"
                    }
                    script(src = "/client.js") { }
                }
            }
        }
    }
}