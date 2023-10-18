package com.example.retrofitsample_codealong

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getAllTodos(): Response<List<Todo>>
}