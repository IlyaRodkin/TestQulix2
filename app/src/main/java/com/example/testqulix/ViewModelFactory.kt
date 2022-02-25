package com.example.testqulix

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testqulix.repository.CurrenciesRepository

class ViewModelFactory (private val repository: CurrenciesRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}