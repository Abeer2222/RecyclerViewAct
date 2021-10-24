package com.example.recyclerviewact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var rvmain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rvmain=findViewById(R.id.rvmain)

        val output= intent.extras?.get("information")

        rvmain.adapter=RVAdapter(output as ArrayList<String>)
        rvmain.layoutManager= LinearLayoutManager(this)

    }
}