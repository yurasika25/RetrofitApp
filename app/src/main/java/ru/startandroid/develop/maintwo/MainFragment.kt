package ru.startandroid.develop.maintwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import ru.startandroid.develop.R
import ru.startandroid.develop.catandbird.screens.three.AddEditFragment
import ru.startandroid.develop.photos.PhotosFragment
import ru.startandroid.develop.start.PostsFragment


class MainFragment : Fragment(), MainFragmentView {

    private var presenter: MainFragmentPresenter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        presenter = MainFragmentPresenter()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigation.setOnNavigationItemSelectedListener { item ->
            presenter!!.onNavigationClicked(item)

            false
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

    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun navigateToPosts() {
        val fragment: Fragment = PostsFragment.newInstance()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }

    override fun navigateToPhotos() {
        val fragment: Fragment = AddEditFragment.newInstance()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }
}