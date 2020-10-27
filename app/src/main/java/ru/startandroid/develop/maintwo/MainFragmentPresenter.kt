package ru.startandroid.develop.maintwo

import android.view.MenuItem
import ru.startandroid.develop.R
import ru.startandroid.develop.mvp.BasicPresenter

class MainFragmentPresenter : BasicPresenter<MainFragmentView?> (){

    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.navigateToPosts()
    }

    fun onNavigationClicked(item:MenuItem){
        when (item.itemId) {
            R.id.navigation_posts -> {
                getView()?.navigateToPosts()
            }
            R.id.navigation_photo -> {
                getView()?.navigateToFragmentPhoto()
            }
            R.id.navigation_person -> {
                getView()?.navigateToAddEdit()
            }
        }
    }
}