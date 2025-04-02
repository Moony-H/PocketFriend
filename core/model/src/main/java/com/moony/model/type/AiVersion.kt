package com.moony.model.type

sealed class AvailableAiVersion {
    abstract fun getAvailableAiTypeList(): List<AiType>
}

data object Level24OrAbove : AvailableAiVersion() {
    override fun getAvailableAiTypeList(): List<AiType> =
        listOf(AiType.GEMMA_1, AiType.API)
}

data object Level26OrAbove : AvailableAiVersion() {
    override fun getAvailableAiTypeList(): List<AiType> =
        listOf(AiType.GEMMA_1, AiType.GEMMA_2, AiType.API)
}
