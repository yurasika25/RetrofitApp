package ru.startandroid.develop.main

import ru.startandroid.develop.mvp.BasicPresenter

class MainPresenter : BasicPresenter<MainView?>() {

    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.onNavigateToMainFragment()
    }


}

