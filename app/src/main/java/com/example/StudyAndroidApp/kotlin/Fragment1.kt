package com.example.StudyAndroidApp.kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.StudyAndroidApp.R

class Fragment1 : Fragment() {
    override fun onCreateView(
        // fragment가 interface를 처음으로 그릴 때 호출
        // Activity는 onCreate
        inflater: LayoutInflater, // view를 그려줌
        container: ViewGroup?, // 부모 view
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
        Log.d("life_cycle", "F onCreateView")
    }
}