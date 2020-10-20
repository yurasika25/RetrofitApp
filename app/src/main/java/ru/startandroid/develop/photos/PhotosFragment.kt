package ru.startandroid.develop.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.R

class PhotosFragment : Fragment(), PhotosFragmentView{
    private var presenter: PhotosFragmentPresenter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_photos, container, false)
        presenter = PhotosFragmentPresenter()
        return view
    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()

    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }
    companion object {
        fun newInstance(): PhotosFragment {
            val args = Bundle()
            val fragment = PhotosFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun navigateToPhotos() {}
}