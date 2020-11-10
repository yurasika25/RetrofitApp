package test.startandroid.develop.ui.post

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import test.startandroid.develop.R

const val BUNDLE_POST_ID = "POST_ID"

class DeletePostsDialog : DialogFragment(){

    interface onDeletePostsListener{
        fun onDelete(id : Int)
        fun onDeleteCanceled()
    }

    companion object
    {
        fun show(fragment: Fragment, id : Int)
        {
            require(fragment is onDeletePostsListener){"$fragment must implement OnWordDeleteListener"}
            val bundle = Bundle()
            bundle.apply {
                putInt(BUNDLE_POST_ID , id)
            }
            val dialog =  DeletePostsDialog()
            dialog.arguments = bundle
            dialog.show(fragment.childFragmentManager,"DeletePostsDialog")
        }
    }

    private val listener get() = parentFragment as onDeletePostsListener

    override fun onCreateDialog(savedInstanceState: Bundle?)=
        AlertDialog.Builder(requireContext())
            .setTitle(getString(R.string.delete_post_title))
            .setPositiveButton(getString(R.string.accept)) { _, _, -> listener.onDelete(requireArguments().getInt(
                BUNDLE_POST_ID
            )) }
            .setNegativeButton(getString(R.string.Cancel)) { _, _, -> this.dismiss() }
            .create()
    }