package com.example.myapplicationnn

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.myapplicationnn.databinding.ImageSliderItemBinding


class ViewPagerAdapter(private val imageUrlList: List<String>):
RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    inner class ViewPagerViewHolder(val binding: ImageSliderItemBinding) :
            RecyclerView.ViewHolder(binding.root) {
                fun setData(imageUrl: String) {
                    Glide.with(binding.root.context)
                        .load(imageUrl)
                        .transition(DrawableTransitionOptions.withCrossFade())
                        .into(binding.imageView)
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding = ImageSliderItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int = imageUrlList.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.setData(imageUrlList[position])
    }

}