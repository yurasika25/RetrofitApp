package ru.startandroid.develop.scroll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.R

class AddEditFragment : Fragment(), AddEditView {

    private var presenter: AddEditPresenter? = null

    companion object {
        fun newInstance(): AddEditFragment {
            val args = Bundle()
            val fragment = AddEditFragment()
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
        val view: View = inflater.inflate(R.layout.fragment_add_edit, container, false)
        presenter = AddEditPresenter()
        return view
    }

    override fun navigateToAddEdit() {}
}