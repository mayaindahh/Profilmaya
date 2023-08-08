package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkilleAdapter(private val  list: ArrayList<SkilleData>) :
    RecyclerView.Adapter<SkilleAdapter.SkilleViewHolder>(){

    class  SkilleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaSkille)
        private val desc = itemView.findViewById<TextView>(R.id.descSkille)

        fun bind(get: SkilleData) {
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkilleViewHolder {
        return SkilleViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.skile_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SkilleViewHolder, position: Int) {
        holder.bind(list[position])
    }
}