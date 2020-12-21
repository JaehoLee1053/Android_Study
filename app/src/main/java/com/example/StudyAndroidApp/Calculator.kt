package com.example.StudyAndroidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.a_practice_calculator.*

class Calculator : AppCompatActivity() {

    var display_number = ""
    var result_number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_practice_calculator)

        val cal = CalculatorFunction(display_number, result_number)

        button0.setOnClickListener {
            Log.d("number", "0")
            cal.setDisplayNumber("0")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button1.setOnClickListener {
            Log.d("number", "1")
            cal.setDisplayNumber("1")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button2.setOnClickListener {
            Log.d("number", "2")
            cal.setDisplayNumber("2")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button3.setOnClickListener {
            Log.d("number", "3")
            cal.setDisplayNumber("3")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button4.setOnClickListener {
            Log.d("number", "4")
            cal.setDisplayNumber("4")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button5.setOnClickListener {
            Log.d("number", "5")
            cal.setDisplayNumber("5")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button6.setOnClickListener {
            Log.d("number", "6")
            cal.setDisplayNumber("6")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button7.setOnClickListener {
            Log.d("number", "7")
            cal.setDisplayNumber("7")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button8.setOnClickListener {
            Log.d("number", "8")
            cal.setDisplayNumber("8")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button9.setOnClickListener {
            Log.d("number", "9")
            cal.setDisplayNumber("9")
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button_clear.setOnClickListener {
            Log.d("number", "CA")
            cal.clearAll()
            text_result.setText(cal.display_number)
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }

        button_plus.setOnClickListener {
            Log.d("number", "plus")
            cal.result_number += cal.display_number.toInt()
            cal.display_number = "0"
            text_result.setText(cal.result_number.toString())
            Log.d("value", "${cal.display_number}\t${cal.result_number}")
        }
    }
}

class CalculatorFunction(display_number: String, result_number: Int) {
    var display_number = display_number
    var result_number = result_number

    fun setDisplayNumber(get_val: String) {
        this.display_number =
            if (this.display_number == "0") get_val else this.display_number + get_val
    }

    fun getSum() {
        this.result_number += (this.display_number).toInt()
        this.display_number = "0"
    }

    fun clearAll() {
        this.display_number = "0"
        this.result_number = 0
    }
}