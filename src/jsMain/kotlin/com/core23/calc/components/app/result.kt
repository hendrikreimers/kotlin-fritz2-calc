package com.core23.calc.components.app

import com.core23.calc.components.grid.*
import dev.fritz2.binding.Store
import dev.fritz2.binding.const
import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements

fun HtmlElements.calcResult(
//        Store<Double>
): Div {
    return row(maxHeight = 2) {
        column {
            className = const("bg-dark txt-white result")

            span(baseClass = "result", id = "value") {
                text("0")
            }
        }
    }
}