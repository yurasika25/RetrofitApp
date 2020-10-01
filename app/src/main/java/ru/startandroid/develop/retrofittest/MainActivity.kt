package ru.startandroid.develop.retrofittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import ru.startandroid.develop.retrofittest.repository.Repository

class  MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            if(response.isSuccessful){

                textView.text = response.body()?.userId.toString()
                textView2.text = response.body()?.id.toString()
                textView3.text = response.body()?.title!!
                textView4.text = response.body()?.body!!

            }else{
                Log.d("Response",response.errorBody().toString())
                textView4.text = response.code().toString()
                textView3.text = response.code().toString()
                textView.text = response.code().toString()
                textView2.text = response.code().toString()



            }


        })


    }
}


