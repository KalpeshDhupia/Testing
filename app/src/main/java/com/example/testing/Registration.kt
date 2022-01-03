package com.example.testing

object Registration {

    private val existingUsers = listOf("Kalpesh", "Dhupia", "Jain")


    fun validUsername(username: String): Boolean {
        if (username.isEmpty() || username.length <= 3) {
            return false
        }
        if (username in existingUsers){
            return false
        }
        return true
    }

    fun validPassword(password: String, confirmPassword: String): Boolean {
        if (password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 6) {
            return false
        }

        return true
    }

    fun validInput(username: String, password: String, confirmPassword: String): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 6) {
            return false
        }
        return true
    }

}