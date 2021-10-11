package com.bayarsahintekin.searchmusicdemo.data.repository

import com.bayarsahintekin.searchmusicdemo.data.model.ErrorModel
import com.bayarsahintekin.searchmusicdemo.data.model.Search
import com.bayarsahintekin.searchmusicdemo.data.network.IServices

class SearchRepository(val service: IServices) {

    suspend fun search() :Search{
        return service.search()
    }
}