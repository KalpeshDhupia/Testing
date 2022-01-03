package com.example.testing

import android.util.Log
import com.google.common.truth.Truth
import org.junit.Test

class HomeworkTest {

    @Test
    fun validBraces() {
        val result = Homework.checkBraces("((0))")
        Truth.assertThat(result).isTrue()

    }

    @Test
    fun invalidBraces() {
        val result = Homework.checkBraces("()()()()()()(")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun whenZeroEnter(){
        val result = Homework.fib(0)
        Truth.assertThat(result).isEqualTo(0)
    }

    @Test
    fun whenOneEnter(){
        val result = Homework.fib(1)
        Truth.assertThat(result).isEqualTo(1)
    }

    @Test
    fun whenNegativeEnter(){
        val result = Homework.fib(-3)
        Truth.assertThat(result).isAtLeast(0)
    }

     @Test
     fun whenPositiveNoEnter(){
         val result = Homework.fib(5)
         Truth.assertThat(result).isEqualTo(5)
     }

}