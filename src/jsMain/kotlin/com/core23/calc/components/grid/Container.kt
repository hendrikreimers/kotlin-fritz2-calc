package com.core23.calc.components.grid

import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements

/**
 * Bootstrap container component
 *
 */
fun HtmlElements.container(id: String? = null, content: Div.() -> Unit): Div {
    return div("container", id = id) {
        content()
    }
}