package com.saif.jetpacknavigationexample.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.saif.jetpacknavigationexample.room.model.Contact

@Dao
interface ContactDao {
    @Insert
   suspend fun insertContact(contact: Contact)
    @Update
   suspend fun updateContact(contact: Contact)
    @Delete
   suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getContacts(): LiveData<List<Contact>>
}