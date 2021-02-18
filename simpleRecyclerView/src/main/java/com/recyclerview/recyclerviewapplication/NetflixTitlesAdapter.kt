package com.recyclerview.recyclerviewapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.recyclerviewapplication.databinding.ListItemMovieBinding
import com.recyclerview.recyclerviewapplication.model.NetflixTitles

class NetflixTitlesAdapter(val netflixTitles: List<NetflixTitles>):RecyclerView.Adapter<NetflixTitlesAdapter.NetflixTitlesViewHolder>() {

    class NetflixTitlesViewHolder(val binding:ListItemMovieBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(titles: NetflixTitles){
            val context=binding.root.context
            binding.apply {
                title.text=context.getString(R.string.title,titles.title,titles.release_year.toString())
                type.text=titles.type
                plot.text=context.getString(R.string.plot,titles.description)
                director.text=context.getString(R.string.director,titles.director)
                casts.text=context.getString(R.string.casts,titles.cast)
                country.text=context.getString(R.string.country,titles.country)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NetflixTitlesViewHolder {
        val dataBinding=ListItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return NetflixTitlesViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: NetflixTitlesViewHolder, position: Int) {
        val item=netflixTitles[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = netflixTitles.size
}