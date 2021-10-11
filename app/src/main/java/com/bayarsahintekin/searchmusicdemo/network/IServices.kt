package com.bayarsahintekin.searchmusicdemo.network

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface IServices {

    @GET("search")
    suspend fun search() : Response<String>

    companion object {
        var retrofitService: IServices? = null
        fun getInstance() : IServices {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://howtodoandroid.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(IServices::class.java)
            }
            return retrofitService!!
        }
    }
}