package ru.startandroid.develop.start

import ru.startandroid.develop.mvp.BasicView
import ru.startandroid.develop.retrofittest.model.Post
import ru.startandroid.develop.retrofittest.model.TestModel


interface PostsFragmentView : BasicView{
    fun navigateToAddEdit()
    fun navigateToPhotos()

    fun setUpUI(data : List<Post>)

}