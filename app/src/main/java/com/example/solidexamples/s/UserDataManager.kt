package com.example.solidexamples.s

import com.example.solidexamples.s.model.User

class UserDataManager {
    private var userPassword = "0000"
    private var name = "danchik"
    private lateinit var user: User

    fun getUserData(): User {
        user = User(password = userPassword,name = name)
        return user
    }

    fun saveUserData(userPassword: String,name : String) {
        this.userPassword = userPassword
        this.name = name
    }
}
