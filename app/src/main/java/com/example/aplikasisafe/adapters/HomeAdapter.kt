package com.example.aplikasisafe.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.databinding.HomeItemBinding
import com.example.aplikasisafe.model.HomeModel

class HomeAdapter(private val list: List<HomeModel>, private val context:Context) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(val binding: HomeItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivanti.setImageResource(this.image)
                binding.judul.text = this.judul
                binding.isi.text = this.isi
            }
        }
    }
}