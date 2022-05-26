package com.saif.jetpacknavigationexample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count: Int = 0
    val quoteLiveData = MutableLiveData("Afnan")

    fun increment() {
        count++
    }

    fun updateQuote(){
        quoteLiveData.value = "Akber"
    }
}