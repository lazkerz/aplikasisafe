package com.example.aplikasisafe.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.databinding.KegiatanItemBinding
import com.example.aplikasisafe.databinding.ObrolanItemBinding
import com.example.aplikasisafe.model.KegiatanModel
import com.example.aplikasisafe.model.ObrolanModel

class KegiatanAdapter(private val list: List<KegiatanModel>, private val context:Context) :
    RecyclerView.Adapter<KegiatanAdapter.ViewHolder>() {

    class ViewHolder(val binding: KegiatanItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = KegiatanItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.imglomba.setImageResource(this.imglomba)
                binding.lomba.text = this.lomba
            }
        }
    }
}