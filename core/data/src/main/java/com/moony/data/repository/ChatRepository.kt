package com.moony.data.repository

import com.moony.model.Chat

interface ChatRepository {
    suspend fun askQuestion(question: Chat)
}
