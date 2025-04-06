package com.moony.data.repository

import com.moony.model.Chat
import com.moony.model.ChatRoomId

interface ChatRepository {
    suspend fun askQuestion(question: Chat)
    suspend fun getChatHistoryPage(page: Int, chatRoomId: ChatRoomId): List<Chat>
}
