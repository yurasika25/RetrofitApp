package ru.startandroid.develop.start

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.startandroid.develop.mvp.BasicPresenter
import ru.startandroid.develop.retrofittest.model.Post
import ru.startandroid.develop.retrofittest.repository.Repository

class PostsFragmentPresenter : BasicPresenter<PostsFragmentView?>() {

    private val listItems = mutableListOf<Post>()
    lateinit var repo: Repository

    override fun onEnterScope() {
        super.onEnterScope()
        fetchData()
    }

    fun onPenButtonClicked () {
        getView()?.navigateToAddEdit()
    }


    private fun fetchData() {
        repo = Repository()
        repo.getPost()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result ->
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
