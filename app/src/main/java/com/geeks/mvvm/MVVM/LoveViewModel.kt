package com.geeks.mvvm.MVVM

import androidx.lifecycle.ViewModel

class LoveViewModel:ViewModel() {

    fun calculateLovePercentage(person1: String, person2: String): Int {
        // Простой способ сгенерировать процент "оценки любви" (случайный пример)
        return (Math.random() * 100).toInt()
    }
}