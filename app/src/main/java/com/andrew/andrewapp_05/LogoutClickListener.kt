package com.andrew.andrewapp_05

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.View

class LogoutClickListener(var app : Context) : View.OnClickListener {
    override fun onClick(p0: View?) {
        AlertDialog.Builder(this.app)
            .setTitle("登出")
            .setMessage("確定登出?")
            .setNegativeButton("取消", null)
            .setPositiveButton("確定") { diag, which ->
                this.app.startActivity(Intent(this.app, MainActivity::class.java))}
            .show()
    }
}