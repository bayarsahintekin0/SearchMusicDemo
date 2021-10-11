package com.bayarsahintekin.searchmusicdemo.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bayarsahintekin.searchmusicdemo.data.model.Result
import com.bayarsahintekin.searchmusicdemo.data.network.IServices
import com.bayarsahintekin.searchmusicdemo.data.repository.SearchRepository
import kotlinx.coroutines.*

class MainViewModel: ViewModel() {
    private val apiService = IServices.getInstance()
    private lateinit var repository: SearchRepository
    var searchResult: ArrayList<Result>? = arrayListOf()

    init {

    }

    fun search(){
        repository = SearchRepository(apiService)
        viewModelScope.launch {
            val response = repository.service.search()
            if (response.isSuccessful){
                searchResult = response.body()?.results
            }else {

            }
        }

    }
}