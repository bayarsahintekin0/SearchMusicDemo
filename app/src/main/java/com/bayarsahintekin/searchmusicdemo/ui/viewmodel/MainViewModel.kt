package com.bayarsahintekin.searchmusicdemo.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bayarsahintekin.searchmusicdemo.data.model.Result
import com.bayarsahintekin.searchmusicdemo.data.network.IServices
import com.bayarsahintekin.searchmusicdemo.data.repository.SearchRepository
import com.bayarsahintekin.searchmusicdemo.ui.app.TabCategory
import kotlinx.coroutines.*

class MainViewModel: ViewModel() {
    val TAG = "MainViewModel"
    private val apiService = IServices.getInstance()
    private lateinit var repository: SearchRepository
    var searchResult: List<Result>? by mutableStateOf(listOf())

    val selectedCategory: MutableState<TabCategory> = mutableStateOf(TabCategory.MOVIES)


    fun search(text :String, category :String?){
        if (text.length > 2) {
            repository = SearchRepository(apiService)
            viewModelScope.launch {
                val response = repository.service.search(text, category)
                if (response.isSuccessful) {
                    searchResult = response.body()?.results
                } else {

                }
            }
        }

    }

    fun filterSearchResult(wrapperType :String){

    }

    fun setSelectedCategory(category: TabCategory){
        selectedCategory.value = category
    }

}