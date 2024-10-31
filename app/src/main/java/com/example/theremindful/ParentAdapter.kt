package com.example.theremindful

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class ParentAdapter(private val context: Context) : RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    private val themes = listOf(
        Theme("Sunset", listOf(R.drawable.sunset1, R.drawable.sunset2)),
        Theme("Fishing", listOf(R.drawable.fishing1, R.drawable.fishing2)),
        Theme("Mountains", listOf(R.drawable.mountain1, R.drawable.mountain2)),
        Theme("Beach", listOf(R.drawable.beach1, R.drawable.beach2, R.drawable.beach3, R.drawable.beach4))
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_parent_pager, parent, false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val theme = themes[position]
        holder.bind(theme)
    }

    override fun getItemCount(): Int {
        return themes.size
    }

    inner class ParentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val childViewPager: ViewPager2 = itemView.findViewById(R.id.childViewPager)

        fun bind(theme: Theme) {
            // Pass theme name to the ChildAdapter along with photos
            childViewPager.adapter = ChildAdapter(theme.photos, theme.name)
            childViewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        }
    }
}
