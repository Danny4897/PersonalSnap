package com.kaizen.starter.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DummyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(blogEntity: DummyEntity): Long

    @Query("SELECT * FROM dummies")
    suspend fun get(): List<DummyEntity>
}