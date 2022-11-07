package com.kaizen.starter.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaizen.starter.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}