package ru.startandroid.develop.listphotos

import ru.startandroid.develop.mvp.BasicView

interface PhotoView : BasicView{

    fun initList(list:List<NewModel>)
}
