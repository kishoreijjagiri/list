package com.example.list.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.list.data.network.dto.ArticlesResponseItem
import com.example.list.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: Repository) :ViewModel() {

   private val _data = MutableLiveData<List<ArticlesResponseItem>>()

    val data: LiveData<List<ArticlesResponseItem>>
        get() = _data

    fun getArticles(){

        viewModelScope.launch{
           val response= repository.getArctilcls()

            _data.postValue(response)
            Log.v("Kishore",response.toString())

        }

    }
}