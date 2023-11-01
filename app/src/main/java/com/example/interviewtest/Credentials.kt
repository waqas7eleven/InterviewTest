package com.example.interviewtest

/**
 * Question: Are there any obvious problems? Possible improvements in this Fragment?.
 */

data class Credentials(
    val username: String,
    val password: String
) {

    fun checkPassword(password: String) = password.equals(this.password)

    override fun toString() = "Credentials(username= $username, password= $password)"

    override fun equals(other: Any?) =
        if (other is Credentials) (other.username.equals(username) && other.password.equals(password)) else false

}
