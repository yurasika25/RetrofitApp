package ru.startandroid.develop.retrofittest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.startandroid.develop.retrofittest.model.Post
import ru.startandroid.develop.retrofittest.repository.Repository

class MainViewModel(private val repository:Repository) : ViewModel(){

    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()



    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response

        }
    }


}