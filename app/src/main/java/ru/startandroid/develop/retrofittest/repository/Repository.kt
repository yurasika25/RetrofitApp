package ru.startandroid.develop.retrofittest.repository

import io.reactivex.Observable
import ru.startandroid.develop.retrofittest.api.RetrofitInstance
import ru.startandroid.develop.retrofittest.model.Post

class Repository {
     fun getPost(): Observable<List<Post>> {
       return RetrofitInstance.api.getPost()
    }
}