package test.startandroid.develop.ui.mainfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_navigation_main.*
import test.startandroid.develop.R
import test.startandroid.develop.ui.photos.FragmentPhoto
import test.startandroid.develop.ui.post.PostsFragment

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
        val view = inflater.inflate(R.layout.fragment_navigation_main, container, false)
        presenter = MainFragmentPresenter()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation.setOnNavigationItemSelectedListener { item ->
            presenter!!.onNavigationClicked(item)
            true
        }
    }

    override fun navigateToPosts() {
        val fragment: Fragment = PostsFragment.newInstance()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }

    override fun navigateToFragmentPhoto() {
        val fragment: Fragment = FragmentPhoto.newInstance()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }

}