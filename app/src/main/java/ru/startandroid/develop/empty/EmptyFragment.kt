package ru.startandroid.develop.empty

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.R

class EmptyFragment : Fragment(), EmptyFragmentView {

    private var presenter: EmptyFragmentPresenter? = null

    companion object {
        fun newInstance(): EmptyFragment {
            val args = Bundle()
            val fragment = EmptyFragment()
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

        val view: View = inflater.inflate(R.layout.fragment_empty, container, false)
        presenter = EmptyFragmentPresenter()
        return view
    }

    override fun navigateToEmpty() {}
}