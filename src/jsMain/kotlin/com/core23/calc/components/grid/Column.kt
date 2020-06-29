package com.core23.calc.components.grid

import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.HtmlElements
import kotlin.math.max
import kotlin.math.min

/**
 * Bootstrap column
 *
 */
fun HtmlElements.column(colSizes: ColSizes = ColSizes(), content: Div.() -> Unit): Div {
    return div(colSizes.toClassString()) {
        content()
    }
}

/**
 * Returns css class string for bootstrap columns
 *
 */
data class ColSizes(
        val default: Int? = null,
        val xs: Int? = null,
        val sm: Int? = null,
        val md: Int? = null,
        val lg: Int? = null,
        val xl: Int? = null
) {
    private val prefix: String = "col"

    fun toClassString(): String {
        val classList: ArrayList<String> = arrayListOf()

        if ( default !== null ) classList.add("$prefix-${getStringInRange(default)}") else "col"
        if ( xs !== null ) classList.add(getBreakpointString("xs", xs))
        if ( sm !== null ) classList.add(getBreakpointString("xs", sm))
        if ( md !== null ) classList.add(getBreakpointString("xs", md))
        if ( lg !== null ) classList.add(getBreakpointString("xs", lg))
        if ( xl !== null ) classList.add(getBreakpointString("xs", xl))

        return classList.joinToString(" ")
    }

    private fun getStringInRange(num: Int): String =
            max(1, min(12, num)).toString()

    private fun getBreakpointString(breakpoint: String, cols: Int): String =
            "$prefix-$breakpoint-${getStringInRange(cols)}"
}