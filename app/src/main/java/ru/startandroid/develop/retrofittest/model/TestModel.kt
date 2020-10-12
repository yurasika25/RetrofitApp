package ru.startandroid.develop.retrofittest.model

import android.net.Uri

 class TestModel {
    var title: String?
    var worlds: String? = null
    var time: String? = null

//    constructor(parse: Uri?) {}

//    var image: Uri? = null

    constructor( title: String?, worlds: String?, time: String?) {
        this.title = title
        this.worlds = worlds
        this.time = time

        //        this.image = image

    }
}

