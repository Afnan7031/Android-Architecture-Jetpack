package com.saif.jetpacknavigationexample.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saif.jetpacknavigationexample.viewmodels.MainViewModel
import com.saif.jetpacknavigationexample.viewmodels.MainViewModelWithFactory

class MainViewModelFactory(private val counter : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
      return  MainViewModelWithFactory(counter) as T
     }
}