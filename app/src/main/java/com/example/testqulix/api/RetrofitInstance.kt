package com.example.testqulix.api

import com.example.testqulix.utils.Constants.Companion.BASE_URL
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    val interceptor = HttpLoggingInterceptor()

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val api: CurrenciesApi by lazy {
        retrofit.create(CurrenciesApi::class.java)
    }
}