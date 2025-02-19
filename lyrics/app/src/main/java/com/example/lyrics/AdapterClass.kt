package com.example.lyrics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass (private val dataList : ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    var onItemClick: ((DataClass) -> Unit)? = null


    class ViewHolderClass (itemView: View): RecyclerView.ViewHolder(itemView){

        val rvNumber: TextView = itemView.findViewById(R.id.number)
        val rvTitle: TextView = itemView.findViewById(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvNumber.text = currentItem.dataNumber.toString()
        holder.rvTitle.text = currentItem.dataTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }
    }
}