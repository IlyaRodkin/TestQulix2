package com.example.testqulix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testqulix.model.ResponseTest
import com.example.testqulix.repository.CurrenciesRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: CurrenciesRepository): ViewModel() {

    val currencyResponse: MutableLiveData<Response<List<ResponseTest>>> = MutableLiveData()

    fun getCurrencies(){
        viewModelScope.launch {
            val response = repository.getCurrencies()
            currencyResponse.value = response
        }
    }
}