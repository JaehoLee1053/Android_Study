package com.example.StudyAndroidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // View를 activity로 가져오는 방법
        // 1. 직접 찾아서 가져오기
        // val textView: TextView = findViewById(R.id.hello)
        // 2. xml을 import하여 가져오기
        // hello // Kotlin 방식

        // 1: Lambda (익명함수를 좀 더 간당히 쓸 수 있음)
        hello.setOnClickListener {
            Log.d("click", "Click!")
        }
        // 2: 익명함수
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "Click!")
            }
        })
        // 3
        val click = object : View.OnClickListener {
            override fun onClick(v: View?) {
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.solid)
                number += 10
                Log.d("number", "$number")
            }
        }

        hello.setOnClickListener(click)

        // View를 조작하는 함수 (동적인 view는 activity, 정적은 xml)
        // 1> setText
        // 2> setImageS=Resource
    }
}
