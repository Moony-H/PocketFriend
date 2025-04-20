package com.moony.chat.viewmodel

import androidx.lifecycle.ViewModel
import com.moony.data.repository.ChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val charRepository: ChatRepository
) : ViewModel() {

}
