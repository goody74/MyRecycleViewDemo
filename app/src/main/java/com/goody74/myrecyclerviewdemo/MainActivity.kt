package com.goody74.myrecyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cityList: List<City> = listOf(
            City("Vladivostok", 600000),
            City("Ussuriisk", 300000),
            City("Nakhodka", 200000),
            City("Arseniev", 100000),
            City("Spassk-Dalniy", 150000),

            )

        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        usersRecyclerView.adapter = CityAdapter(cityList)

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this,
            "Click Names of the Cities to view population",
            Toast.LENGTH_LONG,
        ).show()
    }
}
