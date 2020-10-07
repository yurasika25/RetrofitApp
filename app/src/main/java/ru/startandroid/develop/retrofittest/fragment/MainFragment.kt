package ru.startandroid.develop.retrofittest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.retrofittest.R
import ru.startandroid.develop.retrofittest.main.MainPresenter

class MainFragment : Fragment(), MainFragmentView {
    var presenter: MainFragmentView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        presenter = MainPresenter()
        return view
    }


    companion object{
        fun newInstance (): MainFragment{
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun navigateToMainFragmentView() {

    }

    override fun onNavigateToMainFragment() {
        TODO("Not yet implemented")
    }
}

