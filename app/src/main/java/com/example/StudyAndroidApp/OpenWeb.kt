package com.example.StudyAndroidApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_open_web.*

class OpenWeb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_web)

        btn_open_web.setOnClickListener {
            val webAddress = edit_text_address.text.toString()
            Log.d("address", "$webAddress")

            val intentOpenWeb = Intent(Intent.ACTION_VIEW, Uri.parse(webAddress))
            startActivity(intentOpenWeb)
        }

        edit_text_address.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.d("edit", "afterTextChanged $s")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit", "beforeTextChanged $s")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit", "onTextChanged $s")
            }
        })
    }
}
