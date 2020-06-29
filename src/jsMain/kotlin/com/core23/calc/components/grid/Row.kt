package com.core23.calc.components.grid

import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements
import kotlin.math.max
import kotlin.math.min

/**
 * Bootstrap row
 *
 */
fun HtmlElements.row(maxHeight: Int = 1, content: Div.() -> Unit): Div {
    return div("row max-height mh-${maxHeight.toString()}") {
        content()
    }
}