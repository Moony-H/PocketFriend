package com.moony.data.repository

import com.moony.data.DummyGenerator
import com.moony.model.Chat

class ChatRepositoryFake : ChatRepository {
    override suspend fun askQuestion(question: Chat) {
        DummyGenerator.getRandomAiChat()
    }
}
