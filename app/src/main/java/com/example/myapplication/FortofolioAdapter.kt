package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class FortofolioAdapter (private val list: ArrayList<FortofolioData>):
     RecyclerView.Adapter<FortofolioAdapter.FortofolioViewHolder>(){

    class FortofolioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val logo = itemView.findViewById<ImageView>(R.id.logofortofolio)
        private val judul = itemView.findViewById<TextView>(R.id.judulfortofolio)
        private val desc = itemView.findViewById<TextView>(R.id.deskripsifortofolio)

        fun bind(get: FortofolioData) {
            logo.setImageResource(get.logo)
            judul.text = get.judul
            desc.text = get.desc

            judul.setOnClickListener {
                val open = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(open)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FortofolioViewHolder {
        return FortofolioViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.fortofolio_list, parent, false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FortofolioViewHolder, position: Int) {
        holder.bind(list[position])
    }
}