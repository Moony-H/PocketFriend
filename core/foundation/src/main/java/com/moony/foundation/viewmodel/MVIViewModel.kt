package com.moony.foundation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moony.foundation.throttleFirst
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

abstract class MVIViewModel<UI_STATE : UiState, INTENT : Intent, SIDE_EFFECT : SideEffect> :
    ViewModel() {

    private val throttleMillis = 300L
    abstract fun handleIntent(intent: INTENT)

    protected val state: MutableStateFlow<UI_STATE> by lazy {
        MutableStateFlow(initState())
    }
    private val _sideEffect: Channel<SIDE_EFFECT> = Channel(Channel.BUFFERED)
    protected val sideEffect: Flow<SIDE_EFFECT> = _sideEffect.receiveAsFlow()

    //더 개선 필요.
    private val _intent: Flow<INTENT> = MutableSharedFlow<INTENT>(
        replay = 0,
        extraBufferCapacity = 3,
        onBufferOverflow = BufferOverflow.DROP_LATEST
    ).throttleFirst(throttleMillis).onEach { handleIntent(it) }


    init {
        _intent.launchIn(viewModelScope)
    }

    protected fun postSideEffect(sideEffect: SIDE_EFFECT) {
        viewModelScope.launch {
            _sideEffect.trySend(sideEffect)
        }
    }


    abstract fun initState(): UI_STATE

}
