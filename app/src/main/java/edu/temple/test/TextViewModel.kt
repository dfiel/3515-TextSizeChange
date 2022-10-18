package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    val textSize : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun setTextSize(size: Int) {
        textSize.value = size
    }

    fun getTextSize() : LiveData<Int> {
        return textSize
    }
}