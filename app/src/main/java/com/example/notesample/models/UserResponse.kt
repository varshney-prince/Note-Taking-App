package com.example.notesample.models

import com.example.notesample.models.User

data class UserResponse(
    val token: String,
    val user: User
)