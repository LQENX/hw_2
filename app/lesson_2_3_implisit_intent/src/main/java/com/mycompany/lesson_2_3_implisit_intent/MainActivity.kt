package com.mycompany.lesson_2_3_implisit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uri = intent.data
        if (uri != null) {
            val uriString = "URI $uri"
            val textView = findViewById<TextView>(R.id.text_uri_message)
            textView.text = uriString
        }
    }
}