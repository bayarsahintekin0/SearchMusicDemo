package com.bayarsahintekin.searchmusicdemo.data.network

import com.bayarsahintekin.searchmusicdemo.data.model.Search
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface IServices {

    @GET("search")
    suspend fun search() : Search

    companion object {
        var retrofitService: IServices? = null
        private const val BASE_URL = "https://itunes.apple.com/"
        fun getInstance() : IServices {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(IServices::class.java)
            }
            return retrofitService!!
        }
    }
}