package com.example.a7minuteworkout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_finish.*
import java.text.SimpleDateFormat
import java.util.*

class FinishActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        setSupportActionBar(toolbar_finish_activity)
        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDefaultDisplayHomeAsUpEnabled(true) //set back button
        }

        toolbar_finish_activity.setNavigationOnClickListener {
            onBackPressed() //if exercise is finished then will go to
        }

        btnFinish.setOnClickListener {
            finish()
        }



    }

    private fun addDateToDatabase() {
        val calendar = Calendar.getInstance()
        val dateTime = calendar.time //get current date an time
        Log.i("DATE:", "" + dateTime)

        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime) //makes date with the format patter of sdf

    }
}