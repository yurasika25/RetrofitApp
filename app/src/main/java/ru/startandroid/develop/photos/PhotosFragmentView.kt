package ru.startandroid.develop.photos

import ru.startandroid.develop.mvp.BasicView

interface PhotosFragmentView : BasicView {
    fun navigateToPhotos()
}