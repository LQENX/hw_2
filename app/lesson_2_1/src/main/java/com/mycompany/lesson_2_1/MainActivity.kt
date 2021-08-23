package com.mycompany.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val TAG: String? = MainActivity::class.simpleName

    private lateinit var mMessageEditText: EditText
    private lateinit var mReplyHeadTextView: TextView
    private lateinit var mReplyTextView: TextView

    companion object {
        const val EXTRA_MESSAGE = "com.mycompany.lesson_2_1.MESSAGE"
        const val TEXT_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editText_main)
        mReplyHeadTextView = findViewById(R.id.text_header_reply)
        mReplyTextView = findViewById(R.id.text_message_reply)

    }

    fun launchSecondActivity(view: View) {
        Log.d(TAG, "Button clicked!")
        val intent = Intent(this, SecondActivity().javaClass)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val reply = data?.getStringExtra(SecondActivity.EXTRA_REPLY)
                mReplyHeadTextView.visibility = View.VISIBLE
                mReplyTextView.setText(reply)
                mReplyTextView.visibility = View.VISIBLE
            }
        }
    }
}