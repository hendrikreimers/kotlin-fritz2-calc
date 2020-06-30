import com.core23.calc.components.app.*
import com.core23.calc.components.grid.*
import com.core23.calc.models.MasterModel
import com.core23.calc.stores.MasterStore
import dev.fritz2.dom.html.render
import dev.fritz2.dom.mount

fun main() {
    val masterStore = MasterStore(MasterModel(0.00))

    render {
        container {

            calcResult()

            row {
                column { keypadButton(label = "C", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "&plusmn;", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "%", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "&divide;", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "7", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "8", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "9", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "x", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "4", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "5", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "6", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "&minus;", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "1", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "2", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "3", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "+", color = BtnColorMap.ORANGE) }
            }

            row {
                column() { keypadButton(label = "0", size = 6, color = BtnColorMap.LIGHTGRAY) }
                column(ColSizes(3)) { keypadButton(label = "&#44;", color = BtnColorMap.LIGHTGRAY) }
                column(ColSizes(3)) { keypadButton(label = "=", color = BtnColorMap.ORANGE) }
            }
        }
    }.mount("target")
}