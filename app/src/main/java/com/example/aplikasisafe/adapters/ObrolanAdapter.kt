package com.example.aplikasisafe.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.databinding.ObrolanItemBinding
import com.example.aplikasisafe.model.ObrolanModel

class ObrolanAdapter(private val list: List<ObrolanModel>, private val context:Context) :
    RecyclerView.Adapter<ObrolanAdapter.ViewHolder>() {

    class ViewHolder(val binding: ObrolanItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ObrolanItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivanti.setImageResource(this.image)
                binding.nama.text = this.nama
                binding.isicht.text = this.isicht
            }
        }
    }
}