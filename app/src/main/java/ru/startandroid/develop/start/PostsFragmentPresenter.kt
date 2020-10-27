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

    fun onFatButtonClicked() {
        getView()?.navigateToEmpty()
    }

    fun onPenButtonClicked () {
        getView()?.navigateToAddEdit()
    }

    fun onDeleteButtonClicked () {
        getView()?.navigateToEmpty()
    }

    private fun fetchData() {
        repo = Repository()
        repo.getPost()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result ->
                result.forEach {
                    listItems.add(it)
                }
                listItems.add(Post("1","Gk","fdfdf","dfdfdf"))
                listItems.forEach {
                    when(it.userId)
                    {
                        "1" ->it.userId += "User"
                        "2"->it.userId += "UserNew"
                        "3"->it.userId += "UserThree"
                        else ->it.userId += "None"
                    }
                }
                getView()?.setUpUI(listItems)
                Log.d("Result", "Success")
            }, { error ->
                error.printStackTrace()
            })
    }
}
