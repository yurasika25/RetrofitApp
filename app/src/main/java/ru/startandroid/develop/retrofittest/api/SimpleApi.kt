package ru.startandroid.develop.retrofittest.api

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import ru.startandroid.develop.retrofittest.model.Post

interface SimpleApi {

    @GET("/posts")
     fun getPost(): Observable<List<Post>>
}