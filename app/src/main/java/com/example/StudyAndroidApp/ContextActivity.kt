package com.example.StudyAndroidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        val contextActivity: ContextActivity = this
        val applicationContextActivity :ContextActivity = getApplicationContext() as ContextActivity
    }
}
