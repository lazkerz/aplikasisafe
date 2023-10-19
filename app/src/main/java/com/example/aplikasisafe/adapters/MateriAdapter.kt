package com.example.aplikasisafe.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.Pelatihan.DetailPelatihanActivity
import com.example.aplikasisafe.databinding.HomeItemBinding
import com.example.aplikasisafe.databinding.MateriItemBinding
import com.example.aplikasisafe.model.HomeModel
import com.example.aplikasisafe.model.MateriModel

class MateriAdapter(private val list: List<MateriModel>, private val context:Context) :
    RecyclerView.Adapter<MateriAdapter.ViewHolder>() {

    class ViewHolder(val binding: MateriItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MateriItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.materi.text = this.materi
                binding.desc.text = this.desc
            }
            binding.root.setOnClickListener {
                val context = holder.itemView.context
                val intent = Intent(context, DetailPelatihanActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
}