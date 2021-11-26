package com.igorwojda.integer.generateallpairs

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    val numbersList = 0..n
    val finalList = mutableListOf<Pair<Int, Int>>()

    for (number in numbersList) {
        for (x in numbersList) {
            finalList.add(Pair(number, x))
        }
    }
    return finalList
}

//Complex challenge -> return (0..n).map { ... }.flatMapIndexed { ... }

private fun getAllPairsFlatMapIndexed(n: Int): List<Pair<Int, Int>> {
    val numbersList = 0..n

    return numbersList.map { number -> numbersList.map { x-> number to x } }.flatMapIndexed { index: Int, list: List<Pair<Int, Int>> -> list }
}

private class Test {
    @Test
    fun `get all pairs 0`() {
        getAllPairsFlatMapIndexed(0) shouldBeEqualTo listOf(0 to 0)
    }

    @Test
    fun `get all pairs 1`() {
        getAllPairsFlatMapIndexed(1) shouldBeEqualTo listOf(
            0 to 0,
            0 to 1,
            1 to 0,
            1 to 1
        )
    }

    @Test
    fun `get all pairs 2`() {
        getAllPairsFlatMapIndexed(2) shouldBeEqualTo listOf(
            0 to 0,
            0 to 1,
            0 to 2,
            1 to 0,
            1 to 1,
            1 to 2,
            2 to 0,
            2 to 1,
            2 to 2
        )
    }
}
