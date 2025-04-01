package com.moony.model.type

import com.moony.model.AiChat
import com.moony.model.Chat
import com.moony.model.UserChat

enum class ChatRole {
    AI, USER;
    companion object{
        fun fromChat(chat:Chat):ChatRole{
            return when(chat){
                is AiChat -> AI
                is UserChat -> USER
            }
        }
    }
}
