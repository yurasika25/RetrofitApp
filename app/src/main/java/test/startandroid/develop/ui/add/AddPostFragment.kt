package test.startandroid.develop.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_add_post.*
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
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_add_post, container, false)
        presenter = AddPostFragmentPresenter()
        return view
    }

    override fun setUpUI() {
        toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
        createB.setOnClickListener {
            val field1 = login.editText!!.text.toString()
            val field2 = password.editText!!.text.toString()
            val userValid = validaLogin(field1)
            if (!userValid) {
                login.error = getString(R.string.empty_item)
            } else {
                login.error = null
            }
            val passwordValida = validaPassword(field2)
            if (!passwordValida) {
                password.error = getString(R.string.empty_item)
            } else {
                password.error = null
            }
            if (userValid && passwordValida) {
                requireActivity().onBackPressed()
            }
        }
    }

    private fun validaLogin(email: String): Boolean {
        return email >= 0.toString()
    }

    private fun validaPassword(password: String): Boolean {
        return password >= 0.toString()
    }
}