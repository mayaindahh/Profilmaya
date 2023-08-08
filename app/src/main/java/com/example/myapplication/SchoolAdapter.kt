package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class SchoolAdapter (private val  list: ArrayList<SchoolData>) :
    RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder>(){

        class  SchoolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            private val nama = itemView.findViewById<TextView>(R.id.namaschool)
            private val alamat = itemView.findViewById<TextView>(R.id.alamatschool)

            fun bind(get: SchoolData) {
                nama.text = get.nama
                alamat.text = get.alamat
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHolder {
          return SchoolViewHolder(LayoutInflater.from(parent.context)
             .inflate(R.layout.education_list, parent, false))
        }

        override fun getItemCount(): Int {
          return  list.size
        }

        override fun onBindViewHolder(holder: SchoolViewHolder, position: Int) {
          holder.bind(list[position])
        }
    }


