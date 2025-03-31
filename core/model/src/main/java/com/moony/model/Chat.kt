package com.moony.model

import com.moony.model.type.ChatRole

interface Chat : Copyable<Chat> {
    val text: String
    val role: ChatRole
}
