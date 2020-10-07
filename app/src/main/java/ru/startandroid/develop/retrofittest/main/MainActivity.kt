package ru.startandroid.develop.retrofittest.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_main.*
import ru.startandroid.develop.retrofittest.MainViewModel
import ru.startandroid.develop.retrofittest.MainViewModelFactory
import ru.startandroid.develop.retrofittest.R
import ru.startandroid.develop.retrofittest.fragment.MainFragment
import ru.startandroid.develop.retrofittest.repository.Repository

class  MainActivity : AppCompatActivity(), MainView {
    private lateinit var viewModel: MainViewModel
    private var presenter: MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()


        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            if (response.isSuccessful) {

//                textView.text = response.body()?.userId.toString()
//                textView2.text = response.body()?.id.toString()
//                textView3.text = response.body()?.title!!
//                textView4.text = response.body()?.body!!
//
//            } else {
//                Log.d("Response", response.errorBody().toString())
//                textView4.text = response.code().toString()
//                textView3.text = response.code().toString()
//                textView.text = response.code().toString()
//                textView2.text = response.code().toString()


            }


        })


    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }

    private fun goToMainFragment() {
        val fragment: Fragment = MainFragment.newInstance()
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.commit()

    }


    override fun onNavigateToMainFragment() {
        goToMainFragment()
    }
}


