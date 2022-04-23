package com.andrew.andrewapp_05

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginClickListener(var app : Context, var username : EditText, var password: EditText) : View.OnClickListener
{
    private var defaultUsername = "admin"
    private var defaultPassword = "12345"
    override fun onClick(p0: View?) {
        if(username.text.toString().isEmpty() || password.text.toString().isEmpty())
        {
            Toast.makeText(this.app,  "尚未輸入" , Toast.LENGTH_LONG).show()
        }
        else if(username.text.toString() == this.defaultUsername && password.text.toString() == this.defaultPassword)
        {
            Toast.makeText(this.app, "登入成功" , Toast.LENGTH_LONG).show()
            this.app.startActivity(Intent(this.app, MainActivity2::class.java))
        }
        else
        {
            Toast.makeText(this.app, "登入失敗", Toast.LENGTH_LONG).show()
        }
    }
}