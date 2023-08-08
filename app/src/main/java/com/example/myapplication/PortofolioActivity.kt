package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var FortofolioView: RecyclerView
    lateinit var FortofolioAdapter: FortofolioAdapter
    val listFortofolio = ArrayList<FortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)


        listFortofolio.add(FortofolioData(
            R.drawable.android, "Tugas-jobsheet20",
            "Projek Latihan LKS bidang Android", "http://github.com/mayaindahh/jobsheet20"
        ))

        listFortofolio.add(FortofolioData(
            R.drawable.web, "Tugas-jobsheet20",
            "Projek Latihan LKS bidang Web", "http://github.com/mayaindahh/jobsheet20"
        ))

        FortofolioView = findViewById(R.id.rvfortofolio)
        FortofolioView.layoutManager = LinearLayoutManager(this)

        FortofolioAdapter = FortofolioAdapter(listFortofolio)
        FortofolioAdapter.notifyDataSetChanged()
        FortofolioView.adapter = FortofolioAdapter
    }
}
