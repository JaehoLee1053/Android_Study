package com.example.StudyAndroidApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent1.*

class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        change_activity.setOnClickListener {
            // val intent = Intent(this@Intent1, Intent2::class.java)

            // Key, Value 방식 -> key와 value를 쌍으로 전달 -> Dictionary
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent) // Intent1에서 2로 이동하겠다

            // 명시적 intent
//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//            intent2.apply {
//                this.putExtra("number1", 1)
//                this.putExtra("number2", 2)
//            }
//            startActivityForResult(intent2, 200)
//            // Intent1 Activity가 Intent2에게 200을 보내는 것

            // 암시적 Intent
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 200) {
            Log.d("number", "#############")
            Log.d("number", "$requestCode")
            Log.d("number", "$resultCode")
            Log.d("number", "#############")
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "$result")
        }
    }
}
