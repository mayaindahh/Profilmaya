package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobyyAdapter(private val  list: ArrayList<HobyyData>) :
    RecyclerView.Adapter<HobyyAdapter.HobyyViewHolder>() {

    class  HobyyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaHoby)
        private val desc = itemView.findViewById<TextView>(R.id.descHoby)

        fun bind(get: HobyyData) {
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobyyViewHolder {
       return HobyyViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.hoby_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobyyViewHolder, position: Int) {
       holder.bind(list[position])
    }
}