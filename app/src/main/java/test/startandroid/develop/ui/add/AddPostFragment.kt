package test.startandroid.develop.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_task.nombreUsuario
import kotlinx.android.synthetic.main.activity_task.password
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
            val usuario = nombreUsuario.editText!!.text.toString()
            val passwordText = password.editText!!.text.toString()

            val usuarioValidado = validarUsuario(usuario)
            if (!usuarioValidado) {
                nombreUsuario.error = "Поле обов'язкове для заповнення"
            } else {
                nombreUsuario.error = null
            }

            val passwordValida = validarPassword(passwordText)
            if (!passwordValida) {
                password.error = "Поле обов'язкове для заповнення"
            } else {
                password.error = null
            }

            if (usuarioValidado && passwordValida) {
                requireActivity().onBackPressed()
            }
        }
        return view
    }


    private fun validarUsuario(usuario: String): Boolean {
        return usuario >= 0.toString()
    }

    private fun validarPassword(password: String): Boolean {
        return password >= 0.toString()
    }
}