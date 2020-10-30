package test.startandroid.develop.ui.mainfragment

import android.view.MenuItem
import test.startandroid.develop.R
import test.startandroid.develop.mvp.BasicPresenter

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
         else -> getView()?.navigateToPosts()
        }
    }
}