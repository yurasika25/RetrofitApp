package ru.startandroid.develop.retrofittest.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.startandroid.develop.retrofittest.utils.Constants.Companion.BASE_URL

object RetrofitInstance {
    private val retrofit by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }


    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}