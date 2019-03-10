package com.example.chatclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nickname = findViewById<View>(R.id.nickname) as TextView
        val btn = findViewById<View>(R.id.enterchat) as Button
        btn.setOnClickListener({
            v -> Toast.makeText(this, "Hola " + nickname.text, Toast.LENGTH_LONG).show()
        })
    }
}
