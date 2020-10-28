package ru.startandroid.develop.listphotos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_photo_recycler.*
import ru.startandroid.develop.R
import ru.startandroid.develop.adapter.MyAdapterTwo

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
        val view: View = inflater.inflate(R.layout.fragment_photo_recycler, container, false)
        presenter = PhotoPresenter()
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        val recyclerView: RecyclerView = view.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager =
            GridLayoutManager(this.context, 3,  RecyclerView.HORIZONTAL, false)
        return view
    }

    override fun initList(list:List<NewModel>) {
        //Set adapter
        val adapter = MyAdapterTwo(list, requireContext())
        recyclerView.adapter = adapter
    }
}

