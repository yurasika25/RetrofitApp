package ru.startandroid.develop.maintwo

import ru.startandroid.develop.mvp.BasicView

interface MainFragmentView : BasicView{
    fun navigateToPosts()
    fun navigateToFragmentPhoto()
    fun navigateToAddEdit()
}