package com.example.interviewtest

import android.graphics.Color
import androidx.core.graphics.toColor
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _bgColor: MutableLiveData<Color> = MutableLiveData(Color.WHITE.toColor())
    val bgColor: LiveData<Color> get() = _bgColor

    fun changeColor() {
        if (_bgColor.value == Color.WHITE.toColor())
            _bgColor.value = Color.valueOf(Color.BLACK)
        else
            _bgColor.value = Color.valueOf(Color.WHITE)
    }

}