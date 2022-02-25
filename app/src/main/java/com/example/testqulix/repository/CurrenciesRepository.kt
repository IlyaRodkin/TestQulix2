package com.example.testqulix.repository

import com.example.testqulix.api.RetrofitInstance
import com.example.testqulix.model.ResponseTest
import retrofit2.Response

class CurrenciesRepository {
    suspend fun getCurrencies(): Response<List<ResponseTest>> {
        return RetrofitInstance.api.getCurrencies()
            //date = date, periodicity = "0")
    }
}