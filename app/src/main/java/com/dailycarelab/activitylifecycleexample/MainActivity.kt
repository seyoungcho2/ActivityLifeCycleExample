package com.dailycarelab.activitylifecycleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dailycarelab.activitylifecycleexample.databinding.ActivityMainBinding
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(activityMainBinding.root)

        activityMainBinding.apply{
            button.setOnClickListener {
                startActivity<AnotherActivity>()
            }
        }

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