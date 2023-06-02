package com.rv198510.asiaflags

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rv198510.asiaflags.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupRecyclerView ()
    }
    fun setupRecyclerView (){
        val adapter = CountryAdapter(this, FlagSpots.list!!)
        binding.exampleView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.HORIZONTAL

        binding.exampleView.layoutManager = layoutManager

    }
}