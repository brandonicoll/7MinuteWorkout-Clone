package com.example.a7minuteworkout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_exercise_status.view.*

class ExerciseStatusAdapter(val items: ArrayList<ExerciseModel>, val context: Context) : RecyclerView.Adapter<ExerciseStatusAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.tvItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //inflate the custom layout
        return ViewHolder(LayoutInflater.from(context)
            .inflate(R.layout.item_exercise_status, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //assign value to each text
        val model: ExerciseModel = items[position]
        holder.tvItem.text = model.getId().toString() //getid is a func i declared in my exercise model.kt
    }

    override fun getItemCount(): Int { //returns the number of items in list
        return items.size
    }

}