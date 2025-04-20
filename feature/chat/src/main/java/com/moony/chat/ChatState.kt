package com.moony.chat

import com.moony.model.Chat

sealed interface ChatState {
    data class Success(
        val isLoading: Boolean,
        val chatList: List<Chat>,
    ) : ChatState

    data class Error(val e: Throwable) : ChatState
    data object Loading : ChatState
}


