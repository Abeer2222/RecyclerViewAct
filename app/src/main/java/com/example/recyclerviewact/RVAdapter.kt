package com.example.recyclerviewact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter(private val information:ArrayList<String>)
    : RecyclerView.Adapter<RVAdapter.ItemHolder>() {
    class ItemHolder (itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val name=information[position]
        holder.itemView.apply {
            textView.text= name

        }    }

    override fun getItemCount()=information.size


}
