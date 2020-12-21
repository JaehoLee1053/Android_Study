package com.example.StudyAndroidApp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent3.*

class Intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent3)

        val number1 = intent.getIntExtra("number1", 0)
        val number2 = intent.getIntExtra("number2", 0)

        Log.d("number", "$number1")
        Log.d("number", "$number2")

        result.setOnClickListener {
            val result = number1 + number2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)


            setResult(Activity.RESULT_OK)
            finish()// Activity 종료 -> Intent1만 남음
            // Stack 구조로 Intent가 쌓임
        }
    }
}
