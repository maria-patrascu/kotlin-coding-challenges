package com.igorwojda.integer.printnumber.basic

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun printNumber(n: Int) = if (n == 0) listOf() else (n downTo 1).toList()

//Extra challenge: clasa de test se numeste RecursivePrintNumber. Cum ai implementa functia asta recursiv?

private fun printNumberRecursive(n: Int): List<Int> {
    val numbersList = mutableListOf<Int>()

    var i = n

    do {
        if (n != 0)
            numbersList.add(i--)
    } while (i >= 1)

    return numbersList
}

class RecursivePrintNumber {
    @Test
    fun `printNumber 0 return listOf()`() {
        printNumberRecursive(0) shouldBeEqualTo listOf()
    }

    @Test
    fun `printNumber 1 return listOf(1)`() {
        printNumberRecursive(1) shouldBeEqualTo listOf(1)
    }

    @Test
    fun `printNumber 3 return listOf(3, 2, 1)`() {
        printNumberRecursive(3) shouldBeEqualTo listOf(3, 2, 1)
    }

    @Test
    fun `printNumber 5 return listOf(5, 4, 3, 2, 1)`() {
        printNumberRecursive(5) shouldBeEqualTo listOf(5, 4, 3, 2, 1)
    }
}
