package com.kaizen.starter.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dummies")
data class DummyEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "body")
    var body: String,

    @ColumnInfo(name = "image")
    var image: String,

    @ColumnInfo(name = "category")
    var category: String
)



