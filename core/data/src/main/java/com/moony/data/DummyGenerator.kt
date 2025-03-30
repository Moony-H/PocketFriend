package com.moony.data

internal object DummyGenerator {
    private val randomAnswer = arrayOf(
        "문휘문휘의 텍스트",
        "무니무니의 텍스트",
        "아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 아주아주 긴 텍스트 "
    )

    fun getRandomAnswer() = randomAnswer.random()
}
