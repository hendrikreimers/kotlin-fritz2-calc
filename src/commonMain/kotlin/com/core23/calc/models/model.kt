package com.core23.calc.models

import dev.fritz2.identification.uniqueId
import dev.fritz2.lenses.Lenses
import dev.fritz2.lenses.WithId

@Lenses
data class MasterModel(
        val value: Double = 0.00,
        val operator: String = "",
        override val id: String = uniqueId()
) : WithId