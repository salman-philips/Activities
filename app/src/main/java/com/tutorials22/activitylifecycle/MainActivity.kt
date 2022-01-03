package com.tutorials22.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG="LifecycleCallBacks"
    private lateinit var goToSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToSecondActivity=findViewById(R.id.go_to_second_Activity)
        goToSecondActivity.setOnClickListener(View.OnClickListener {
            this@MainActivity.startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        })
        Log.d(TAG,"onCreate-MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart-MainActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart-MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume-MainActivity")
    }

    override fun onPause() {
        Log.d(TAG,"onPause-MainActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop-MainActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy-MainActivity")
        super.onDestroy()
    }

}