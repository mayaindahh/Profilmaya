package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var HobbyView: RecyclerView
    lateinit var HobyyAdapter: HobyyAdapter
    val list = ArrayList<HobyyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        HobbyView = findViewById(R.id.rvhobby)
        HobbyView.layoutManager = LinearLayoutManager(this)

        list.add(HobyyData("game", "bulu tangkis"))
        list.add(HobyyData("", ""))

        HobyyAdapter = HobyyAdapter(list)
        HobbyView.adapter = HobyyAdapter

    }
}