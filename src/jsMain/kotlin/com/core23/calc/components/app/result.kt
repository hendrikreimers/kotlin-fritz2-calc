package com.core23.calc.components.app

import com.core23.calc.components.grid.*
import dev.fritz2.binding.const
import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements
import kotlinx.coroutines.flow.*

fun HtmlElements.calcResult(
//        value: FormatStore<MasterModel, Double>
    value: Flow<Double>
): Div {
    return row(maxHeight = 2) {
        column {
            className = const("bg-dark txt-white result")

            span(baseClass = "result", id = "value") {
//                text(value.data.map { it }.toString()) // @todo whats wrong here? and alternative how can i use a flow?
                text(value.map { flowOf(it) }.toString()) // @todo why its not working?
            }//.bind() // @todo why bind not available?
        }
    }
}