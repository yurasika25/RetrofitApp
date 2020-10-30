package test.startandroid.develop.retrofittest.repository

import io.reactivex.Observable
import okhttp3.ResponseBody
import test.startandroid.develop.retrofittest.api.RetrofitInstance
import test.startandroid.develop.retrofittest.model.Post

class Repository {

     fun getPost(): Observable<List<Post>> {
       return RetrofitInstance.api.getPost()
    }

    fun deletePost(id : Int): Observable<ResponseBody> {
        return RetrofitInstance.api.deletePost(id)
    }
}