package ru.startandroid.develop.main

import ru.startandroid.develop.mvp.BasicView

interface MainView : BasicView {
    fun onNavigateToMainFragment()
}
