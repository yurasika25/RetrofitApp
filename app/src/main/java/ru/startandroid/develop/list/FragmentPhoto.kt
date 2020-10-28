package ru.startandroid.develop.catandbird.screens.list

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.photo_main.*
import ru.startandroid.develop.R
import java.util.*

class FragmentPhoto : Fragment(), PhotoView {
    private var presenter: PhotoPresenter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.photo_main, container, false)
        presenter = PhotoPresenter()
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        val recyclerView: RecyclerView = view.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager =
            GridLayoutManager(this.context, 2,  RecyclerView.VERTICAL, false)


        //Set adapter
//        val adapter = MyAdapter(listItems, requireContext())
//        recyclerView.setAdapter(adapter)
        return view
    }


    override fun initList(list:List<TestModel>) {
        //Set adapter
        val adapter = MyAdapter(list, requireContext())
        recyclerView.setAdapter(adapter)
    }

//    override fun showLoader() {
//        progress.isVisible=true
//    }
//
//    override fun hideLoader() {
//        progress.isVisible=false
//    }

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
}

private fun RecyclerView.setAdapter(adapter: MyAdapter) {
}
