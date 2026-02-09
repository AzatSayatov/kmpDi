package com.android.kmpdi.dependency

import androidx.lifecycle.ViewModel

class MyViewModel(
    private val repository: MyRepository
): ViewModel() {
    fun getHelloWorldString(): String{
        return repository.helloWorld()
    }
}