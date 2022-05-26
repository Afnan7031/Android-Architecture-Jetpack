package com.saif.jetpacknavigationexample.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.saif.jetpacknavigationexample.R
import com.saif.jetpacknavigationexample.viewmodels.MainViewModel

class OneTwoWayBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityOneTwoWayBindingBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_one_two_way_binding)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this
    }
}