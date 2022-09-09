package com.unguided.ugd3_15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.unguided.ugd3_15.entity.Star

class RVStarAdapter (private val data: Array<Star>) : RecyclerView.Adapter<RVStarAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item_star, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = data[position]

    }

    override fun getItemCount(): Int {
        return data.size
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val tvNamaStar: TextView = itemView.findViewById(R.id.)
        //val tvDetailsStar: TextView = itemView.findViewById(R.id.)
    }
}