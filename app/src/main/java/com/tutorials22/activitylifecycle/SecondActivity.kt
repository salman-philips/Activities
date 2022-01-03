package com.tutorials22.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    val TAG="LifecycleCallBacks"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG,"onCreate-SecondActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart-SecondActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart-SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume-SecondActivity")
    }

    override fun onPause() {
        Log.d(TAG,"onPause-SecondActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop-SecondActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy-SecondActivity")
        super.onDestroy()
    }

}