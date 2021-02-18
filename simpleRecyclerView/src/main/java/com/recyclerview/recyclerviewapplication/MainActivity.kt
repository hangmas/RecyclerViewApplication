package com.recyclerview.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recyclerview.recyclerviewapplication.databinding.ActivityMainBinding
import com.recyclerview.recyclerviewapplication.model.titlesList

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titlesAdapter=NetflixTitlesAdapter(titlesList)
        binding.recyclerView.apply {
            adapter=titlesAdapter
            layoutManager=LinearLayoutManager(context)
        }
    }
}