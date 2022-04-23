package com.andrew.andrewapp_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edit_username = findViewById<EditText>(R.id.edit_username)
        var edit_password = findViewById<EditText>(R.id.edit_password)
        var btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener(LoginClickListener(
            this, edit_username, edit_password))
    }
}