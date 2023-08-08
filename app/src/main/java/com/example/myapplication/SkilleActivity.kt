package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkilleActivity : AppCompatActivity() {

    lateinit var SkilleView: RecyclerView
    lateinit var SkilleAdapter: SkilleAdapter
    val list = ArrayList<SkilleData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skille)

        SkilleView = findViewById(R.id.rvskille)
        SkilleView.layoutManager = LinearLayoutManager(this)

        list.add(SkilleData("Kotlin","Pemrograman Android "))
        list.add(SkilleData("Laravel", "Pemrograman Web"))

        SkilleAdapter = SkilleAdapter(list)
        SkilleView.adapter = SkilleAdapter
    }
}