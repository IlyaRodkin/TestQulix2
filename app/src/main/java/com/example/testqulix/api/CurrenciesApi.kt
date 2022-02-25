package com.example.testqulix.api

import com.example.testqulix.model.Currency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrenciesApi {

    @GET("api/exrates/rates?periodicity=0&amp")
    suspend fun getCurrencies(
        //@Query("periodicity") periodicity: String,
       // @Query("ondate") date:String
    ): Response<List<Currency>>
}