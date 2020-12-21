package com.example.StudyAndroidApp

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_async.*
import java.lang.Exception
import java.lang.Thread
import java.lang.Thread.sleep

class AsyncActivity : AppCompatActivity() {
    var task: BackgroundAsyncTest? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        btn_start.setOnClickListener {
            var task = BackgroundAsyncTest(progressbar, ment)
            task?.execute()
        }

        btn_stop.setOnClickListener {
//            task?.cancel(true)
            startActivity(Intent(this, Intent2::class.java))
        }

    }

    override fun onPause() {
        task?.cancel(true)
        super.onPause()
    }
}

class BackgroundAsyncTest(
    val progressBar: ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    var percent: Int = 0

    override fun onPreExecute() {
        percent = 0
        progressBar.progress = percent
    }

    override fun doInBackground(vararg params: Int?): Int {
        while (!isCancelled()) {
            percent++
            Log.d("async", "$percent")
            if (percent > 100) {
                break
            } else {
                publishProgress(percent)
            }

            try {
                Thread.sleep(100)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return percent
    }

    override fun onProgressUpdate(vararg values: Int?) {
        progressBar.setProgress(values[0] ?: 0)
        progressText.text = "${values[0]}%"
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Int?) {
        progressText.setText("Complete")
    }

    override fun onCancelled() {
        progressBar.setProgress(0)
        progressText.setText("Cancelled")
    }
}