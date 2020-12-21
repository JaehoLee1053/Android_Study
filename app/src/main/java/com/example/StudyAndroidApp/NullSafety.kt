package com.example.StudyAndroidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    lateinit var lateCar: Car

    class Car(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number: Int = 10
        val number1: Int? = null

//        val number3 = number? + number1
        val number3 = number1?.plus(number)
        Log.d("number", "$number3")

        // 3항연산자 -> 엘비스 연산자
        // Null Safety를 위한 도구
        val number4 = number1 ?: 10
        // number1이 null이면 10을 대입

        lateCar = Car()
    }

    fun plus(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}
