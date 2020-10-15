package ru.startandroid.develop.photos

import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class PhotosFragment : Fragment(), PhotosFragmentView {
    
    private var presenter: PhotosFragmentPresenter? = null

    companion object {
        fun newInstance(): PhotosFragment {
            val args = Bundle()
            val fragment = PhotosFragment()
            fragment.arguments = args
            return fragment
        }
    }
}