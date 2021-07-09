package com.example.a7minuteworkout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
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


    }
}