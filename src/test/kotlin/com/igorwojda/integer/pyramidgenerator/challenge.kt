package com.igorwojda.integer.pyramidgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun generatePyramid(n: Int): List<String> {
    val list = mutableListOf<String>()
    val totalChars = (n * 2) - 1

    for (i in 1..n) {

        var item = ""

        for (char in 1..totalChars) {
            if (char >= n - (i - 1) && char <= n + (i - 1))
                item += "#"
            else
                item += " "
        }
        list.add(item)
    }

    return list
}

private class Test {

    @Test
    fun `pyramid n = 2`() {
        generatePyramid(2).also {
            it.size shouldBeEqualTo 2
            it[0] shouldBeEqualTo " # "
            it[1] shouldBeEqualTo "###"
        }
    }

    @Test
    fun `pyramid n = 3`() {
        generatePyramid(3).also {
            it.size shouldBeEqualTo 3
            it[0] shouldBeEqualTo "  #  "
            it[1] shouldBeEqualTo " ### "
            it[2] shouldBeEqualTo "#####"
        }
    }

    @Test
    fun `pyramid n = 4`() {
        generatePyramid(4).also {
            it.size shouldBeEqualTo 4
            it[0] shouldBeEqualTo "   #   "
            it[1] shouldBeEqualTo "  ###  "
            it[2] shouldBeEqualTo " ##### "
            it[3] shouldBeEqualTo "#######"
        }
    }
}
