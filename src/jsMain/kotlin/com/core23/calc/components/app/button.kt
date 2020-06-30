package com.core23.calc.components.app

import com.core23.calc.components.grid.ColSizes
import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements

fun HtmlElements.keypadButton(
        label: String,
        type: String = "number",
        value: String,
        color: BtnColorMap = BtnColorMap.LIGHTGRAY,
        size: Int = 3
): Div {
    val baseClass: String = "btn ${color.className}"

    return div(baseClass) {
        span("align-middle") {
            text(label)
        }

//        clicks handledBy masterStore.btnNumber
    }
}

enum class BtnColorMap(val className: String) {
    ORANGE("bg-orange txt-white"),
    LIGHTGRAY("bg-lightgray"),
    GRAY("bg-gray")
}
