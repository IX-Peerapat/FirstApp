package com.example.firstapp.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val Id: Int,
    val fName: String,
    val phoneNumber: Int
)