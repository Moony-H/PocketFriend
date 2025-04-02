package com.moony.data.model

import androidx.room.Entity
import com.moony.model.AiChat
import com.moony.model.Chat
import com.moony.model.UserChat
import com.moony.model.type.ChatRole

internal data class ChatDTO(
    val role: ChatRole,
    val text: String
)

internal fun ChatDTO.toChat() = when (role) {
    ChatRole.AI -> AiChat(text)
    ChatRole.USER -> UserChat(text)
}

internal fun Chat.toChatDTO() = ChatDTO(
    ChatRole.fromChat(this),
    text
)
