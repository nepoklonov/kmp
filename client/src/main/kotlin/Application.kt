import kotlinx.browser.document
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.Props
import react.dom.render
import react.fc
import react.useState
import styled.css
import styled.styledButton

fun main() {
    render(document.getElementById("react-app")!!) {
        child(helloWorld)
    }
}

val helloWorld = fc<Props> {
    var flag by useState(false)
    styledButton {
        css {
            color = if (flag) Color.red else Color.blue
        }
        attrs.onClickFunction = {
            flag = !flag
        }
        +"Hello world"
    }
}