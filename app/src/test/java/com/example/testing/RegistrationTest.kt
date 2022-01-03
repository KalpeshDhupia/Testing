package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationTest {

    @Test
    fun emptyUsername() {
        val result = Registration.validUsername("")
        assertThat(result).isFalse()
    }

    @Test
    fun userNamedPasswordCorrect() {
        val result = Registration.validInput("jai", "123456", "123456")
        assertThat(result).isTrue()
    }

    @Test
    fun usernameExist(){
        val result = Registration.validUsername("kalpesh")
        assertThat(result).isTrue()
    }

    @Test
    fun incorrectCnfPassword(){
        val result =  Registration.validPassword("123456","34568999")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordLength(){
        val result = Registration.validPassword("1234","2345")
        assertThat(result).isFalse()
    }
}