package test.startandroid.develop.ui.photos

import test.startandroid.develop.mvp.BasicView
import test.startandroid.develop.retrofittest.model.Picture

interface PhotoView : BasicView{

    fun initList(list:List<Picture>)
}
