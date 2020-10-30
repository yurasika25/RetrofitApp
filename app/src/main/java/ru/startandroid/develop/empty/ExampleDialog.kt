package ru.startandroid.develop.empty

import android.app.AlertDialog.*
import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment

class ExampleDialog : AppCompatDialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: Builder = Builder(activity)
        builder.setTitle("Information")
            .setMessage("This is a Dialog")
            .setPositiveButton("ok",

            ) { _, _ -> }
        return builder.create()
    }
}