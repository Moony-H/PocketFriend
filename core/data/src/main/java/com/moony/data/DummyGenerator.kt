package com.moony.data

import com.moony.model.AiChat

internal object DummyGenerator {
    private val randomAnswer = arrayOf(
        "문휘문휘의 텍스트",
        "무니무니의 텍스트",
        "아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 "
    )

    private fun getRandomAnswer() = randomAnswer.random()
    fun getRandomAiChat() = AiChat(getRandomAnswer())
}
