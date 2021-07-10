package com.example.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_bmiactivity.*
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_main.*

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        setSupportActionBar(toolbar_history_activity)

        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.title = "HISTORY"
        }

        toolbar_history_activity.setNavigationOnClickListener {
            onBackPressed()
        }

        getAllCompletedDates()
    }

    private fun getAllCompletedDates() { //used to fill recycler view
        val dbHandler = SqliteOpenHelper(this, null)
        val allCompletedDatesList = dbHandler.getAllCompletedDatesList() //store the arraylist from function in SqliteOpenHelper to this var

        for (i in allCompletedDatesList) {
            if (allCompletedDatesList.size > 0) {
                tvHistory.visibility = View.VISIBLE
                rvHistory.visibility = View.VISIBLE
                tvNoDataAvailable.visibility = View.GONE

                rvHistory.layoutManager = LinearLayoutManager(this)
                val historyAdapter = HistoryAdapter(this, allCompletedDatesList)
                rvHistory.adapter = historyAdapter
            }
            else {
                tvHistory.visibility = View.GONE
                rvHistory.visibility = View.GONE
                tvNoDataAvailable.visibility = View.VISIBLE
            }
        }
    }

}