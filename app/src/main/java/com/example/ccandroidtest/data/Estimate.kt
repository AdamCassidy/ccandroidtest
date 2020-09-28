package com.example.ccandroidtest.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estimate_table")
data class Estimate{
    @PrimaryKey(autoGenerate =  true)
    val id: Int,
    val company: String,
    val address: String,
    val number: Int,
    val revision_number: Int,
    val created_date: String,
    val created_by: String,
    val requested_by: String,
    val contact: String
}