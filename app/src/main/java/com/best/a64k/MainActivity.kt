package com.best.a64k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }
    private fun getData(){
        button=findViewById(R.id.txtBtnM)
        button.setOnClickListener {
            sendData()
        }
    }

    private fun sendData() {
        val intent = Intent(this, ProfileActivity2::class.java)
        startActivity(intent)
    }
}