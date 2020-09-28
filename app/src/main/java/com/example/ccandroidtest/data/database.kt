package com.example.ccandroidtest.data
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Estimate::class, Person::class], version=1, exportSchema = false)
abstract class database: RoomDatabase{
    abstract fun estimateDao(): EstimateDao
    abstract fun  personDao(): PersonDao

    companion object{
        @Volatile
        private var INSTANCE: database? = null
    }

}