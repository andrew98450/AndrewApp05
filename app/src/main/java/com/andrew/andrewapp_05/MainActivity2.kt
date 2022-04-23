package com.andrew.andrewapp_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn_time = findViewById<Button>(R.id.btn_time)
        var btn_logout = findViewById<Button>(R.id.btn_logout)
        var tv_time = findViewById<TextView>(R.id.tv_time)
        btn_time.setOnClickListener(TimeClickListener(this, tv_time))
        btn_logout.setOnClickListener(LogoutClickListener(this))
    }
}