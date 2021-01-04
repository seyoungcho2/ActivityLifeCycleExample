package com.dailycarelab.activitylifecycleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class AnotherActivity : AppCompatActivity() {
    private val TAG = "AnotherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        Toast.makeText(applicationContext, "onCreate() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onCreate() called")
    }

    override fun onStart() {
        Toast.makeText(applicationContext, "onStart() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(applicationContext, "onResume() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(applicationContext, "onPause() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "onStop() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "onDestroy() called", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onDestroy() called")
        super.onDestroy()
    }
}