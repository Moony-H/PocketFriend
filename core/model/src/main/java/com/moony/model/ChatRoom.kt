package com.moony.model

typealias ChatRoomId = Long

data class ChatRoom(
    val id: ChatRoomId,
    val name: String,
)
