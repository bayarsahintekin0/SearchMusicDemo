package com.bayarsahintekin.searchmusicdemo.data.repository

import com.bayarsahintekin.searchmusicdemo.data.model.ErrorModel
import com.bayarsahintekin.searchmusicdemo.data.model.Search
import com.bayarsahintekin.searchmusicdemo.data.network.IServices
import retrofit2.Response

class SearchRepository(val service: IServices) {

    suspend fun search(term: String, category :String) :Response<Search>{
        return service.search(term,category)
    }
}