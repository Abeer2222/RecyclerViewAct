package com.example.recyclerviewact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var et1: EditText
    lateinit var et2:EditText
    lateinit var et3:EditText
    lateinit var et4:EditText
    lateinit var button: Button
    lateinit var informaion:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        et2=findViewById(R.id.et2)
        et3=findViewById(R.id.et3)
        et4=findViewById(R.id.et4)
        button=findViewById(R.id.button)
        informaion= arrayListOf()

        button.setOnClickListener {
            informaion= arrayListOf("${et1.text}","${et2.text}","${et3.text}","${et4.text}")
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("information",informaion)
            startActivity(intent)

        }
    }
}