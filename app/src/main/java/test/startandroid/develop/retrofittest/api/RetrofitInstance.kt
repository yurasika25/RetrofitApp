package test.startandroid.develop.retrofittest.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import test.startandroid.develop.utils.Constants.Companion.BASE_URL

object RetrofitInstance {

    private val retrofit by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }

    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}