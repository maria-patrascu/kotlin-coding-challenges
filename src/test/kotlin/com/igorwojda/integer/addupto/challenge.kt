package com.igorwojda.integer.addupto

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun addUpTo(n: Int): Int {
    var count = 0
    var i = 0

    do {
        count += ++i
    } while (i < n)

    return count
}

//Extra challenge: o implementare similara cu countDown?
//**Am uitat de existenta functiei "sum()" in kotlin

private fun addDownTo(n: Int) = n.downTo(1).sum()

private fun addDownToItinerate(n: Int): Int {
    var count = 0
    var i = n

    do {
        count += i--
    } while (i >= 1)

    return count
}

private class Test {
    @Test
    fun `add up to 1`() {
        addDownToItinerate(1) shouldBeEqualTo 1
    }

    @Test
    fun `add up to 3`() {
        addDownToItinerate(3) shouldBeEqualTo 6
    }

    @Test
    fun `add up to 10`() {
        addDownToItinerate(10) shouldBeEqualTo 55
    }
}
