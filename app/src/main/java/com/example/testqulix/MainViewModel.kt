package com.example.testqulix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testqulix.model.Currency
import com.example.testqulix.repository.CurrenciesRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: CurrenciesRepository): ViewModel() {

    val currencyResponse: MutableLiveData<Response<List<Currency>>> = MutableLiveData()

    fun getCurrencies(date: String){
        viewModelScope.launch {
            val response = repository.getCurrencies(date)
            currencyResponse.value = response
        }
    }
}