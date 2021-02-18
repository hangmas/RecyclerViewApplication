package com.recyclerview.listadapterrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recyclerview.listadapterrecyclerview.databinding.ActivityMainBinding
import com.recyclerview.listadapterrecyclerview.model.titlesList

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val netflixTitlesAdapter=NetflixTitlesAdapter()
        binding.recyclerView.apply {
            adapter=netflixTitlesAdapter
            layoutManager=LinearLayoutManager(context)
        }
        netflixTitlesAdapter.submitList(titlesList)
    }
}