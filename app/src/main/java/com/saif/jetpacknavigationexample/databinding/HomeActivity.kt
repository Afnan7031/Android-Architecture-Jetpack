package com.saif.jetpacknavigationexample.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.saif.jetpacknavigationexample.R

/**
 * Benefit of data binding
 * declarative bind the views with data
 * we can define variable in data tag in xml
 **/
class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        val quoteObj = Quote("Do, or do not. There is no try.", "Yoda")

        binding.quote = quoteObj
    }
}