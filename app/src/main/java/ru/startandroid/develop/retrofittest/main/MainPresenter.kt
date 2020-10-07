package ru.startandroid.develop.retrofittest.main

import ru.startandroid.develop.retrofittest.BasicPresenter
import ru.startandroid.develop.retrofittest.fragment.MainFragmentView

class MainPresenter : BasicPresenter <MainView?>(), MainFragmentView {
    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.onNavigateToMainFragment()
    }

    override fun navigateToMainFragmentView() {
        TODO("Not yet implemented")
    }

    override fun onNavigateToMainFragment() {
        TODO("Not yet implemented")
    }
}

