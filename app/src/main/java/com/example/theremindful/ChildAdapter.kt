package com.example.theremindful

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val photos: List<Int>, private val themeName: String) : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind(photos[position], themeName)
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textViewTheme: TextView = itemView.findViewById(R.id.textViewTheme)

        fun bind(photoResId: Int, themeName: String) {
            imageView.setImageResource(photoResId)
            textViewTheme.text = themeName
        }
    }
}
