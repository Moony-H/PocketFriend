package com.moony.model

interface Copyable<T> {
    fun copy(modify: T.() -> T)
}
