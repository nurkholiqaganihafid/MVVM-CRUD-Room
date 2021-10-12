package com.nurkholiq.mvvm_curd_room

import androidx.recyclerview.widget.RecyclerView
import com.nurkholiq.mvvm_curd_room.databinding.ListItemBinding
import com.nurkholiq.mvvm_curd_room.db.Subscriber

class MyRecyclerViewAdapter {
}

class MyViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(subscriber: Subscriber) {
        binding.nameTextView.text = subscriber.name
        binding.emailTextView.text = subscriber.email
    }
}