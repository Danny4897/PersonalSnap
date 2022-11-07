package com.kaizen.starter.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DummyEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun dummyDao(): DummyDao

    companion object {
        const val DATABASE_NAME: String = "app_db"
    }


}