package com.moony.data.repository

interface ChatRepository {
    suspend fun askQuestion(question: String): String
}
