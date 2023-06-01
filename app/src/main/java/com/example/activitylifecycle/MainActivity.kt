package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "${lifecycle.currentState} - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "${lifecycle.currentState} - onResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d("LifeCycle", "${lifecycle.currentState} - onPostResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "${lifecycle.currentState} - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "${lifecycle.currentState} - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "${lifecycle.currentState} - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "${lifecycle.currentState} - onDestroy")
    }

}