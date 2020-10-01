package ru.startandroid.develop.retrofittest.repository

import retrofit2.Response
import ru.startandroid.develop.retrofittest.api.RetrofitInstance
import ru.startandroid.develop.retrofittest.model.Post

class Repository {
    suspend fun getPost(): Response<Post>{
       return RetrofitInstance.api.getPost()

    }

}