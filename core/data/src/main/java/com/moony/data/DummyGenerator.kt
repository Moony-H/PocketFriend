package com.moony.data

import com.moony.model.AiChat
import com.moony.model.UserChat

internal object DummyGenerator {
    private val randomAnswer = arrayOf(
        "문휘문휘의 텍스트",
        "무니무니의 텍스트",
        "아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 "
    )


    private fun getRandomAnswer() = randomAnswer.random()
    private fun getRandomUserChat() = UserChat(getRandomAnswer())
    fun getRandomAiChat() = AiChat(getRandomAnswer())
    fun getRandomChat(num: Int = 10) =
        List(num) { if (it % 2 == 0) getRandomUserChat() else getRandomAiChat() }

}
