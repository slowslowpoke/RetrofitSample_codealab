package com.example.retrofitsample_codealong

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)