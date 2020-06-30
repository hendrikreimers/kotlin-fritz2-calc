import com.core23.calc.components.app.*
import com.core23.calc.components.grid.*
import com.core23.calc.models.L
import com.core23.calc.models.MasterModel
import com.core23.calc.stores.MasterStore
import dev.fritz2.dom.html.render
import dev.fritz2.dom.mount
import kotlinx.coroutines.flow.map

fun main() {
    val masterModel = MasterModel()
    val masterStore = MasterStore(MasterModel(0.00))

    val operatorStore = masterStore.sub(L.MasterModel.operator)

    render {
        container {

            calcResult(masterStore.data.map { it.value })

            row {
                column { keypadButton(label = "C", type = "operator", value = "C", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "&plusmn;", type = "operator", value = "+-", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "%", type = "operator", value = "%", color = BtnColorMap.GRAY) }
                column { keypadButton(label = "&divide;", type = "operator", value = "/", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "7", value = "7", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "8", value = "8", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "9", value = "9", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "x", type = "operator", value = "x", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "4", value = "4", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "5", value = "5", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "6", value = "6", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "&minus;", type = "operator", value = "-", color = BtnColorMap.ORANGE) }
            }

            row {
                column { keypadButton(label = "1", value = "1", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "2", value = "2", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "3", value = "3", color = BtnColorMap.LIGHTGRAY) }
                column { keypadButton(label = "+", type = "operator", value = "+", color = BtnColorMap.ORANGE) }
            }

            row {
                column() { keypadButton(label = "0", value = "0", size = 6, color = BtnColorMap.LIGHTGRAY) }
                column(ColSizes(3)) { keypadButton(label = "&#44;", type = "operator", value = ",", color = BtnColorMap.LIGHTGRAY) }
                column(ColSizes(3)) { keypadButton(label = "=", type = "operator", value = "=", color = BtnColorMap.ORANGE) }
            }
        }
    }.mount("target")
}