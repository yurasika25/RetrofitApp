package ru.startandroid.develop.start

import ru.startandroid.develop.mvp.BasicView
import ru.startandroid.develop.retrofittest.model.Post


interface PostsFragmentView : BasicView{
    fun navigateToAddEdit()
    fun navigateToPhotos()
    fun navigateToEmpty()

    fun setUpUI(data : List<Post>)

}