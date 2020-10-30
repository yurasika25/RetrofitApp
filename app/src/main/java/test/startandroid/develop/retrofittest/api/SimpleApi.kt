package test.startandroid.develop.retrofittest.api

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import test.startandroid.develop.retrofittest.model.Post


interface SimpleApi {

    @GET("/posts")
     fun getPost(): Observable<List<Post>>

    @DELETE("/posts/{id}")
    fun deletePost(@Path("id") bookId: Int): Observable<ResponseBody>
}