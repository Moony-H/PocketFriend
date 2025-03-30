package com.moony.data.repository

import com.moony.data.DummyGenerator

class ChatRepositoryFake: ChatRepository {
    override suspend fun askQuestion(question: String): String {
        return DummyGenerator.getRandomAnswer()
    }
}
