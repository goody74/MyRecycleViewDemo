package com.goody74.myrecyclerviewdemo


import android.view.View
// import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(city: City) {
        val cityNameTextView: TextView = itemView.findViewById(R.id.city_name_text_view)

        cityNameTextView.text = city.cityName

        cityNameTextView.setOnClickListener {
            Toast.makeText(itemView.context, "Population: ${city.cityPopulation}", Toast.LENGTH_LONG)
                .show()
        }
        }
    }