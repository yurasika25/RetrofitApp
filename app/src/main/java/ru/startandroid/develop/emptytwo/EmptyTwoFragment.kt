package ru.startandroid.develop.emptytwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.R

class EmptyTwoFragment : Fragment(), EmptyTwoFragmentView {

    private var presenter: EmptyTwoFragmentPresenter? = null

    companion object {
        fun newInstance(): EmptyTwoFragment {
            val args = Bundle()
            val fragment = EmptyTwoFragment()
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

        val view: View = inflater.inflate(R.layout.fragment_empty_two, container, false)
        presenter = EmptyTwoFragmentPresenter()
        return view
    }
}