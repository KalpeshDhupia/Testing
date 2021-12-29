package com.example.testing

object Registration {

    private val existingUsers = listOf("Kalpesh", "Dhupia", "Jain")

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