package test.startandroid.develop.ui.main

import test.startandroid.develop.mvp.BasicPresenter

class MainPresenter : BasicPresenter<MainView?>() {

    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.onNavigateToMainFragment()
    }
}

