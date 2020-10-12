package ru.startandroid.develop.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_main.*
import ru.startandroid.develop.R
import ru.startandroid.develop.adapter.MyAdapter
import ru.startandroid.develop.retrofittest.model.Post

class MainFragment : Fragment(), MainFragmentView {

    private var presenter: MainFragmentPresenter? = null

    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.item_main, container, false)
        presenter = MainFragmentPresenter()
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

    override fun setUpUI(data : List<Post>) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = MyAdapter(data, context!!)
        recyclerView.adapter = adapter
    }

}
