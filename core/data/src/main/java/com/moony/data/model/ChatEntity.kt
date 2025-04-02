package com.moony.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "chat",
)
data class ChatEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0
)
