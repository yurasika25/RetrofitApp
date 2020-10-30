package test.startandroid.develop.ui.post

import test.startandroid.develop.mvp.BasicView
import test.startandroid.develop.retrofittest.model.Post

interface PostsFragmentView : BasicView{

    fun navigateToAddPost()
    fun setUpUI(data : List<Post>)
    fun onDeleteSuccess(id : Int)

}