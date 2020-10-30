package test.startandroid.develop.ui.mainfragment

import test.startandroid.develop.mvp.BasicView

interface MainFragmentView : BasicView{

    fun navigateToPosts()
    fun navigateToFragmentPhoto()
}