package com.saif.jetpacknavigationexample.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.room.Room
import com.saif.jetpacknavigationexample.R
import com.saif.jetpacknavigationexample.databinding.ActivityHome2Binding
import com.saif.jetpacknavigationexample.room.model.Contact
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.util.*

class HomeActivity : AppCompatActivity() {

    private lateinit var database: ContactDatabase
    private lateinit var binding: ActivityHome2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home2)

        database = ContactDatabase.getDatabase(this)

        CoroutineScope(IO).launch {
            database.contactDao().insertContact(
                Contact(
                    0,
                    "Afnan",
                    "123456",
                    Date(),
                    1
                )
            )

        }

        binding.button.setOnClickListener {
            database.contactDao().getContacts().observe(this) {
                Log.d("afnan_Db", it.toString())
            }
        }
    }
}