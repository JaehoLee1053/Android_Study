package com.example.StudyAndroidApp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_resource.*

class ResourceActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello)
        Log.d("ment", "$ment")

        //2
        val ment2 = getString(R.string.hello)
        Log.d("ment", "$ment")

        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.textviewColor)
        } else {
            button.setBackgroundColor(getColor(R.color.textviewColor))
        }
        Log.d("ment", "$color")

    }
}
