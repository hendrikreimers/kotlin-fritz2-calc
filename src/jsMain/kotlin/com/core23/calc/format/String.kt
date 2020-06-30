package de.core23.calc.format

import dev.fritz2.format.Format

object Format {
    val double = object : Format<Double> {
        override fun parse(value: String): Double = value.toDouble()
        override fun format(value: Double): String = value.toString()
    }
}
