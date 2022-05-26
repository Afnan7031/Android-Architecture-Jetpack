package com.saif.jetpacknavigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.saif.jetpacknavigationexample.factory.MainViewModelFactory
import com.saif.jetpacknavigationexample.viewmodels.MainViewModel
import com.saif.jetpacknavigationexample.viewmodels.MainViewModelWithFactory

class MainActivity : AppCompatActivity() {

    lateinit var textCounter: TextView
    lateinit var mainViewModel: MainViewModelWithFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModelWithFactory::class.java)
        textCounter = findViewById(R.id.textView)
        setText()

        findViewById<Button>(R.id.button).setOnClickListener {
         increment()
        }
    }

    private fun setText() {
        textCounter.text = mainViewModel.count.toString()
    }

    private fun increment() {
        mainViewModel.increment()
        setText()
    }
}