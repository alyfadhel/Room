package com.example.room.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tasks(
    @ColumnInfo @PrimaryKey(autoGenerate = true) var id: Int?=null,
    @ColumnInfo var title: String?=null,
    @ColumnInfo var description: String?=null,
    @ColumnInfo var isCompleted: Boolean?=false
)
