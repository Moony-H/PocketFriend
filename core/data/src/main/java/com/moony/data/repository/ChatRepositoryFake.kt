package com.moony.data.repository

import com.moony.data.DummyGenerator
import com.moony.model.Chat
import com.moony.model.ChatRoomId

class ChatRepositoryFake : ChatRepository {
    override suspend fun askQuestion(question: Chat) {
        DummyGenerator.getRandomAiChat()
    }

    override suspend fun getChatHistoryPage(page: Int, chatRoomId: ChatRoomId): List<Chat> {
        return DummyGenerator.getRandomChat()
    }
}
