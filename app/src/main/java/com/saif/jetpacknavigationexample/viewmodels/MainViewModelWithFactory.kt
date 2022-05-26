package com.saif.jetpacknavigationexample.viewmodels

import androidx.lifecycle.ViewModel

class MainViewModelWithFactory(initialValue : Int)
    : ViewModel() {
    var count : Int = initialValue

    fun increment(){
        count++
    }
}