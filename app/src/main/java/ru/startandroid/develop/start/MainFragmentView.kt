package ru.startandroid.develop.start

import ru.startandroid.develop.mvp.BasicView
import ru.startandroid.develop.retrofittest.model.Post
import ru.startandroid.develop.retrofittest.model.TestModel


interface MainFragmentView : BasicView{

    fun setUpUI(data : List<Post>)

}