package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LatestItemsBinding

class LatestItemAdapter (val LatestItemList: List<LatestItems>): RecyclerView.Adapter<LatestItemAdapter.LatestItemViewHolder>(){

    inner class LatestItemViewHolder(val binding: LatestItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestItemViewHolder {
        val binding = LatestItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LatestItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LatestItemViewHolder, position: Int) {
        holder.binding.latestName.text = LatestItemList.get(position).latestName
    }

    override fun getItemCount(): Int = LatestItemList.size

}