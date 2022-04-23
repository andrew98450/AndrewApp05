package com.andrew.andrewapp_05

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.view.View
import android.widget.TextView

class TimeClickListener(var app : Context, var tv_time : TextView) : View.OnClickListener {

    override fun onClick(p0: View?) {
        var time = Time(this.app, tv_time)

        time.getDateTime()
        DatePickerDialog(this.app, time, time.year, time.month, time.day).show()
    }
}