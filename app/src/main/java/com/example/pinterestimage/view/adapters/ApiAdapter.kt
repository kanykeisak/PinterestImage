package com.example.pinterestimage.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.pinterestimage.databinding.ItemListBinding
import com.example.pinterestimage.model.models.ApiResponse

class ApiAdapter: ListAdapter<ApiResponse.Hit, ApiAdapter.ApiViewHolder>(ApiDiffUtil) {


    class ApiViewHolder(
        val binding: ItemListBinding
    ): ViewHolder (
        binding.root
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiViewHolder {
        val binding = ItemListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ApiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ApiViewHolder, position: Int) {
        holder.binding.apply {
            val item = getItem(position)
            Glide.with(holder.itemView)
                .load(item.largeImageURL)
                .into(imageView)
        }
    }

    object ApiDiffUtil: DiffUtil.ItemCallback<ApiResponse.Hit>() {
        override fun areItemsTheSame(oldItem: ApiResponse.Hit, newItem: ApiResponse.Hit): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ApiResponse.Hit, newItem: ApiResponse.Hit): Boolean {
            return oldItem == newItem
        }
    }
}