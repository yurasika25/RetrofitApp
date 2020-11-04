package test.startandroid.develop.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_add_post.view.*
import test.startandroid.develop.R

class AddPostFragment : Fragment(), AddPostFragmentView {

    private var presenter: AddPostFragmentPresenter? = null

    companion object {
        fun newInstance():AddPostFragment {
            val args = Bundle()
            val fragment = AddPostFragment()
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

        val view: View = inflater.inflate(R.layout.fragment_add_post, container, false)
        view.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
        view.create.setOnClickListener {

        }
        presenter = AddPostFragmentPresenter()
        return view
    }
}
