package com.keepcoding.instagramparapobres

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.keepcoding.instagramparapobres.databinding.ImageItemBinding

class ImageRecyclerAdapter : RecyclerView.Adapter<ImageViewHolder>() {


    var imageList: List<String> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run { ImageViewHolder(this) }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size
}

data class ImageViewHolder(val binding: ImageItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: String) {
        with(binding) {
            Glide.with(root).load(image).into(imageView)
        }
    }
}