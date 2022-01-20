package com.example.asynctask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = findViewById(R.id.textContaner)
        val button: Button = findViewById(R.id.buttonLoad)

        button.setOnClickListener {
            FakeLoading(text).execute()
        }
    }
}