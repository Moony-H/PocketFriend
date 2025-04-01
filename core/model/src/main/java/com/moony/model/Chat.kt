package com.moony.model

sealed class Chat(
    val text: String,
)

class UserChat(text: String) : Chat(text)
class AiChat(text: String) : Chat(text)
