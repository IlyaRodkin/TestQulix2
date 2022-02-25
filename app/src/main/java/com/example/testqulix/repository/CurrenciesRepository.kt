package com.example.testqulix.repository

import com.example.testqulix.api.RetrofitInstance
import com.example.testqulix.model.Currency
import retrofit2.Response

class CurrenciesRepository {
    suspend fun getCurrencies(date:String): Response<List<Currency>> {
        return RetrofitInstance.api.getCurrencies()
            //date = date, periodicity = "0")
    }
}