package com.example.room.database.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room.database.dao.TasksDao

@Database(entities = [Tasks::class],version = 1, exportSchema = false)
abstract class TasksDataBase: RoomDatabase() {
    abstract fun tasksDao():TasksDao


    companion object{
        var dataBase: TasksDataBase?=null
        private val Data_Base_Name="tasks-db"
        fun getInstance(context: Context):TasksDataBase{
            if (dataBase==null){
               dataBase = Room.databaseBuilder(context,TasksDataBase::class.java, Data_Base_Name)
                   .fallbackToDestructiveMigration().allowMainThreadQueries().build()
            }
            return dataBase!!
        }
    }
}