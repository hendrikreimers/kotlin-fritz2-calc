package com.core23.calc.components.app

import com.core23.calc.components.grid.*
import dev.fritz2.binding.const
import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements

fun HtmlElements.calcResult(): Div {
    return row(maxHeight = 2) {
        column(ColSizes(12)) {
            className = const("bg-dark txt-white result ")

            span(baseClass = "align-bottom", id = "value") {
                text("0")
            }
        }
    }
}