package com.recyclerview.listadapterrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.listadapterrecyclerview.databinding.ListItemMovieBinding
import com.recyclerview.listadapterrecyclerview.model.NetflixTitles

class NetflixTitlesAdapter:ListAdapter<NetflixTitles,NetflixTitlesAdapter.NetflixTitlesViewHolder>(NetflixTitlesDiffUtil()) {

    class NetflixTitlesViewHolder(val binding:ListItemMovieBinding): RecyclerView.ViewHolder(binding.root){
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
        val dataBinding=ListItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NetflixTitlesViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: NetflixTitlesViewHolder, position: Int) {
        val item=getItem(position)
        holder.bind(item)
    }
}
class NetflixTitlesDiffUtil:DiffUtil.ItemCallback<NetflixTitles>(){
    override fun areItemsTheSame(oldItem: NetflixTitles, newItem: NetflixTitles): Boolean {
        return oldItem.show_id==newItem.show_id
    }

    override fun areContentsTheSame(oldItem: NetflixTitles, newItem: NetflixTitles): Boolean {
        return oldItem==newItem
    }

}