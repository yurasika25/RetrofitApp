package test.startandroid.develop.ui.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_photo.*
import test.startandroid.develop.R
import test.startandroid.develop.adapter.PhotosAdapter
import test.startandroid.develop.retrofittest.model.Picture

private const val SPAN_COUNT = 3

class FragmentPhoto : Fragment(), PhotoView {

    private var presenter: PhotoPresenter? = null

    companion object {
        fun newInstance(): FragmentPhoto {
            val args = Bundle()
            val fragment = FragmentPhoto()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_photo, container, false)
        presenter = PhotoPresenter()
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(photosRV)
        return view
    }

    override fun initList(list: List<Picture>) {
        //Set adapter
        photosRV.setHasFixedSize(true)
        photosRV.layoutManager = GridLayoutManager(this.context, SPAN_COUNT, RecyclerView.HORIZONTAL, false)
        val adapter = PhotosAdapter(list, requireContext())
        photosRV.adapter = adapter
    }
}

