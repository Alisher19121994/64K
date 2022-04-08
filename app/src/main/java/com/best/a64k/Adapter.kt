package com.best.a64k

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list:ArrayList<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class Mode(view: View) : RecyclerView.ViewHolder(view) {
        var a: TextView = view.findViewById(R.id.item_txt1)
        var b: TextView = view.findViewById(R.id.item_txt2)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter, parent, false)
        return Mode(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val list = list[position]
        if (holder is Mode){
            holder.a.text = list.name
            holder.b.text = list.id
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}