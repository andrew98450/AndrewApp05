package com.andrew.andrewapp_05

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class Time(var app :Context, var tv_time : TextView) : DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener
{
    var hour = 0
    var minute = 0
    var year = 0
    var month = 0
    var day = 0

    var savedHour = 0
    var savedMinute = 0
    var savedYear = 0
    var savedMonth = 0
    var savedDay = 0

    fun getDateTime()
    {
        val cal = Calendar.getInstance()
        this.day = cal.get(Calendar.DAY_OF_MONTH)
        this.month = cal.get(Calendar.MONTH)
        this.minute = cal.get(Calendar.MINUTE)
        this.year = cal.get(Calendar.YEAR)
        this.hour = cal.get(Calendar.HOUR)
    }

    override fun onTimeSet(p0: TimePicker?, hourOfDay: Int, minute: Int) {
        this.savedHour = hourOfDay
        this.savedMinute = minute
        tv_time.text = String.format("%d-%d-%d\nHour: %d Minute: %d",
            this.savedYear, this.savedMonth, this.savedDay, this.savedHour, this.savedMinute)
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, dayOfMonth: Int) 
    {
        this.savedYear = year
        this.savedMonth = month + 1
        this.savedDay = dayOfMonth

        this.getDateTime()
        TimePickerDialog(this.app, this, this.hour, this.minute, true).show()
    }
}