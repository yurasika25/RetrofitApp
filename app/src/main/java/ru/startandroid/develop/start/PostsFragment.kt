package ru.startandroid.develop.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_posts.*
import ru.startandroid.develop.R
import ru.startandroid.develop.adapter.MyAdapter
import ru.startandroid.develop.catandbird.screens.three.AddEditFragment
import ru.startandroid.develop.photos.PhotosFragment
import ru.startandroid.develop.retrofittest.model.Post

class PostsFragment : Fragment(), PostsFragmentView {
    private var constraintLayout : ConstraintLayout? = null



    private var presenter: PostsFragmentPresenter? = null

    companion object {
        fun newInstance(): PostsFragment {
            val args = Bundle()
            val fragment = PostsFragment()
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
        val view: View = inflater.inflate(R.layout.fragment_posts, container, false)
        constraintLayout = view.findViewById(R.id.containerNew)
        presenter = PostsFragmentPresenter()
        val button = view.findViewById<FloatingActionButton>(R.id.FAT)
        button.setOnClickListener { presenter!!.onFatButtonClicked() }
        return view
    }

    override fun navigateToAddEdit() {
        val fragment : Fragment = AddEditFragment.newInstance()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.add(R.id.mainContainer,fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun navigateToPhotos() {
        val fragment : Fragment = PhotosFragment.newInstance()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer,fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun setUpUI(data : List<Post>) {
        recyclerViewTwo.setHasFixedSize(true)
        recyclerViewTwo.layoutManager = LinearLayoutManager(context)
        val adapter =  MyAdapter(data) {presenter?.onPenButtonClicked()}
        recyclerViewTwo.adapter = adapter
    }
}
