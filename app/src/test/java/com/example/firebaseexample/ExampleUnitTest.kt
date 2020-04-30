package com.example.firebaseexample

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val prices1 = intArrayOf(57, 9, 40, 3, 38, 1, 23)
        println(maxProfit(prices1))
        assertEquals(4, 2 + 2)
    }

    fun maxProfit(prices: IntArray): Int {
        var minValue = prices[0]
        var maxProfit = 0
        for (i in 1 until prices.size) {
            if (prices[i] < minValue) {
                minValue = prices[i]
            } else if (prices[i] > maxProfit) {
                maxProfit = prices[i] - minValue
            }
        }
        return maxProfit
    }
}
