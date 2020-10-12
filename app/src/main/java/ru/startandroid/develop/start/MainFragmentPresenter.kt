package ru.startandroid.develop.start

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.startandroid.develop.mvp.BasicPresenter
import ru.startandroid.develop.retrofittest.model.Post
import ru.startandroid.develop.retrofittest.model.TestModel
import ru.startandroid.develop.retrofittest.repository.Repository


class MainFragmentPresenter : BasicPresenter<MainFragmentView?>() {

   private val listItems = mutableListOf<Post>()

  lateinit  var repo : Repository


    override fun onEnterScope() {
        super.onEnterScope()
        // завантажити дані через ретрофіт тут
     fetchData()

    }

    private fun fetchData()
    {
        repo=Repository()
        repo.getPost()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
        .subscribe ({ result ->
                result.forEach {
                    listItems.add(it)
                    getView()?.setUpUI(listItems)
                }
                Log.d("Result", "Success")
            }, { error ->
                error.printStackTrace()
            })
    }
}
