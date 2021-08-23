package com.mycompany.helloandersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String? = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "info Tag")
        Log.d(TAG, "debug Tag")
        Log.e(TAG, "exception Tag")
        Log.v(TAG, "verbose Tag")
        Log.w(TAG, "warn Tag")
        Log.wtf(TAG, "some secret Tag")
    }
}