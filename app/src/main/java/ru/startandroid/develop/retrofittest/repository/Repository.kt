package ru.startandroid.develop.retrofittest.repository

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Response
import ru.startandroid.develop.retrofittest.api.RetrofitInstance
import ru.startandroid.develop.retrofittest.model.Post
import java.util.*

class Repository {
     fun getPost(): Observable<List<Post>> {
       return RetrofitInstance.api.getPost()

    }

}