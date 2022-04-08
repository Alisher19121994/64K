package com.best.a64k

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfileActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
        open()
    }

    private fun open() {
        context=this
        recyclerView = findViewById(R.id.recyclerviewP)
        recyclerView.layoutManager = GridLayoutManager(context,1)
            val list = ArrayList<Member>()
            list.add(Member("Alisher", "123"))
            list.add(Member("Abbos", "456"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            list.add(Member("Begzod", "789"))
            refresh(list)
    }

    private fun refresh(list: ArrayList<Member>) {
        val adapter = Adapter(list)
        recyclerView.adapter = adapter
    }
}