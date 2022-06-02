package com.saif.jetpacknavigationexample.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.saif.jetpacknavigationexample.room.dao.ContactDao
import com.saif.jetpacknavigationexample.room.model.Contact
import com.saif.jetpacknavigationexample.room.model.Converters

@Database(entities = [Contact::class], version = 2)
@TypeConverters(Converters::class)

abstract class ContactDatabase : RoomDatabase(){
    abstract fun contactDao() : ContactDao

    companion object{

        val migration_1_2 = object : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }

        }
        @Volatile
        private var INSTANCE : ContactDatabase? = null

        fun getDatabase(context : Context) : ContactDatabase{
            if (INSTANCE == null)
            {
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDB")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}