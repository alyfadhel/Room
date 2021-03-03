package com.example.room.database.dao

import androidx.room.*
import com.example.room.database.model.Tasks

@Dao
interface TasksDao {

    @Insert
    fun addTasks(tasks: Tasks)


    @Update
    fun updateTasks(tasks: Tasks)


    @Delete
    fun deleteTasks(tasks: Tasks)

    @Query("select* from Tasks")
    fun getAllTasks():List<Tasks>

    @Query("select* from Tasks where title like :word or description like :word")
    fun searchForTasks(word: String):List<Tasks>
}