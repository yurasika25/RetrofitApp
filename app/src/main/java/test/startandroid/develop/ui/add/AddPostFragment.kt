package test.startandroid.develop.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_add_post.view.*
import test.startandroid.develop.R

class AddPostFragment : Fragment(), AddPostFragmentView {

    private var presenter: AddPostFragmentPresenter? = null

    companion object {
        fun newInstance(): AddPostFragment {
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
        presenter = AddPostFragmentPresenter()

        view.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
        view.create.setOnClickListener {
            val field1 = view.one.text.toString()
            val field2 = view.two.text.toString()
            presenter!!.onCreateButtonClicked(field1, field2)
        }
        return view
    }

    override fun onCredentialsWrong() {
        Toast.makeText(activity, "ПОМИЛКА", Toast.LENGTH_LONG).show()

    }

    override fun onBack() {
        requireActivity().onBackPressed()

    }
}