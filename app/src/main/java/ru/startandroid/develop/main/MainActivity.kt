package ru.startandroid.develop.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import ru.startandroid.develop.R
import ru.startandroid.develop.maintwo.MainFragment

class  MainActivity : AppCompatActivity(), MainView {

    private var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()
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
        // відкриваємо Main Fragment із bottom navigation
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


