package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationTest {

    @Test
    fun emptyUsername() {
        val result = Registration.validInput("", "123456", "123456")
        assertThat(result).isFalse()
    }

    @Test
    fun userNamedPasswordCorrect() {
        val result = Registration.validInput("jai", "123456", "123456")
        assertThat(result).isTrue()
    }

    @Test
    fun usernameExist(){
        val result = Registration.validInput("kalpesh","123456","123456")
        assertThat(result).isTrue()
    }

    @Test
    fun incorrectCnfPassword(){
        val result =  Registration.validInput("Om","123456","234567")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordLength(){
        val result = Registration.validInput("Ramesh","1234","1234")
        assertThat(result).isFalse()
    }
}