package com.bayarsahintekin.searchmusicdemo.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bayarsahintekin.searchmusicdemo.data.model.Result
import com.bayarsahintekin.searchmusicdemo.data.network.IServices
import com.bayarsahintekin.searchmusicdemo.data.repository.SearchRepository
import kotlinx.coroutines.*

class MainViewModel: ViewModel() {
    private val apiService = IServices.getInstance()
    private lateinit var repository: SearchRepository
    var searchResult: List<Result>? by mutableStateOf(listOf())
    lateinit var clickedItem: Result
    private val query = mutableStateOf("")

    fun search(text :String){
        repository = SearchRepository(apiService)
        viewModelScope.launch {
            val response = repository.service.search(text)
            if (response.isSuccessful){
                searchResult = response.body()?.results
            }else {

            }
        }

    }

    fun onQueryChanged(query: String){
        this.query.value = query
    }

    fun itemClicked(item: Result) {
        clickedItem = item
    }
}