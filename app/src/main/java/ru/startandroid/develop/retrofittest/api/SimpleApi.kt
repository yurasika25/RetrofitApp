package ru.startandroid.develop.retrofittest.api

import retrofit2.Response
import retrofit2.http.GET
import ru.startandroid.develop.retrofittest.model.Post

interface SimpleApi {

    @GET("posts/55")
    suspend fun getPost(): Response<Post>
}