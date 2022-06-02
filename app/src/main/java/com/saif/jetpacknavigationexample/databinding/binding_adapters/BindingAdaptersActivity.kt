package com.saif.jetpacknavigationexample.databinding.binding_adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saif.jetpacknavigationexample.R
import com.saif.jetpacknavigationexample.databinding.ActivityBindingAdaptersBinding

class BindingAdaptersActivity : AppCompatActivity() {
 private lateinit var binding : ActivityBindingAdaptersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapters)

        val post = Post("Intro to Kotlin",
            "Hey Welcome to FaniLabs",
            "https://source.unsplash.com/user/c_v_r/100x100"
         )
        binding.post = post

    }
}