package com.core23.calc.stores

import dev.fritz2.binding.RootStore

val masterStore = object: RootStore<Int>(0) {
    val btnNumber = handle<Int> { curValue, num: Int ->
        curValue + num
    }
}