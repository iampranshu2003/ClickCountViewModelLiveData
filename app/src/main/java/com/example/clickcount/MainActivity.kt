package com.example.clickcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counter = findViewById<TextView>(R.id.tvCounter)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val btnClick = findViewById<Button>(R.id.btnCount)
        //counter.text = viewModel.count.toString()
        viewModel.count.observe(this) {
            counter.text = it.toString()
        }


        btnClick.setOnClickListener {
            count++
//            counter.text = count.toString()
            viewModel.updateCount()
            //counter.text = viewModel.count.toString()
        }
        
    }
}