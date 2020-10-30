package test.startandroid.develop.ui.post

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import test.startandroid.develop.mvp.BasicPresenter
import test.startandroid.develop.retrofittest.model.Post
import test.startandroid.develop.retrofittest.repository.Repository

class PostsFragmentPresenter : BasicPresenter<PostsFragmentView?>() {

    private val listItems = mutableListOf<Post>()
    var repo= Repository()

    override fun onEnterScope() {
        super.onEnterScope()
        fetchData()
    }

    fun onFatButtonClicked() {
        getView()?.navigateToAddPost()
    }

    // TODO pull to refresh
    private fun fetchData() {
        repo.getPost()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result ->
                result.forEach {
                    listItems.add(it)
                }
                listItems.add(Post("1", "Ok", "good", "cool"))
                listItems.forEach {
                    when (it.userId) {
                        "1" -> it.userId += "User"
                        "2" -> it.userId += "UserNew"
                        "3" -> it.userId += "UserThree"
                        else -> it.userId += "None"
                    }
                }
                getView()?.setUpUI(listItems)
                Log.d("Result", "Success")
            }, { error ->
                error.printStackTrace()
            })
    }

    fun onDeletePostClicked(id: Int) {
        deletePost(id)
    }

    // Only fake delete with success API response because of API
    private fun deletePost(id: Int) {
        repo.deletePost(id)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                getView()?.onDeleteSuccess(id)
                Log.d("Result", "Success delete")
            }, { error ->
                error.printStackTrace()
            })
    }

}
