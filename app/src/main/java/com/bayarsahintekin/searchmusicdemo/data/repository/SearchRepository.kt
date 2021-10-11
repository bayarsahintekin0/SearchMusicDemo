package com.bayarsahintekin.searchmusicdemo.data.repository

import com.bayarsahintekin.searchmusicdemo.data.model.ErrorModel
import com.bayarsahintekin.searchmusicdemo.data.model.Search
import com.bayarsahintekin.searchmusicdemo.data.network.IServices

class SearchRepository(val service: IServices) {

    sealed class Result {
        object LOADING :Result()
        data class Success(val searchResult :Search) :Result()
        data class Failure(val error: ErrorModel) :Result()
    }

    suspend fun search() :Search{
        return service.search()
    }
}