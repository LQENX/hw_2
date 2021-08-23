package com.mycompany.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val TAG: String? = MainActivity::class.simpleName

    private lateinit var mMessageEditText: EditText

    companion object {
        const val EXTRA_MESSAGE = "com.mycompany.lesson_2_1.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editText_main)
    }

    fun launchSecondActivity(view: View) {
        Log.d(TAG, "Button clicked!")
        val intent = Intent(this, SecondActivity().javaClass)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)

    }
}