package com.example.kotlinsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.javaSample.dsl.Video
import com.example.kotlinsample.kotlinSample.dsl.VideoDSL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VideoDSL(Video()).apply {
            onStart = {

            }
        }
    }


}