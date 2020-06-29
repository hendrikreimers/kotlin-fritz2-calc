import com.core23.calc.components.app.*
import com.core23.calc.components.grid.*
import dev.fritz2.dom.html.render
import dev.fritz2.dom.mount

fun main() {
//    val masterStore = object: RootStore<>(...) { ... }

    render {
        container {

            calcResult()

            row {
                keypadButton(label = "C", color = BtnColorMap.GRAY)
                keypadButton(label = "&plusmn;", color = BtnColorMap.GRAY)
                keypadButton(label = "%", color = BtnColorMap.GRAY)
                keypadButton(label = "&divide;", color = BtnColorMap.ORANGE)
            }

            row {
                keypadButton(label = "7", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "8", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "9", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "&minus;", color = BtnColorMap.ORANGE)
            }

            row {
                keypadButton(label = "1", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "2", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "3", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "+", color = BtnColorMap.ORANGE)
            }

            row {
                keypadButton(label = "0", size = 6, color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "&#44;", color = BtnColorMap.LIGHTGRAY)
                keypadButton(label = "=", color = BtnColorMap.ORANGE)
            }
        }
    }.mount("target")
}