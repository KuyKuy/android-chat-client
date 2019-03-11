package com.example.chatclient

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val USER_NICKNAME = "USER_NICKNAME"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Se llama cuando el usuario hace click en el boton 'enterchat' */
    fun enterChatRoom(view: View) {
        val nickEditor = findViewById<EditText>(R.id.nickname)
        val nickname = nickEditor.text.toString()
        val intent = Intent(this, ChatRoom::class.java).apply {
            putExtra(USER_NICKNAME, nickname)
        }

        startActivity(intent)
    }

}
