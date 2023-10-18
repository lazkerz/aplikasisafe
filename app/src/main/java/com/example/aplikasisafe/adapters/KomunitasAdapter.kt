package com.example.aplikasisafe.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.databinding.KomunitasItemBinding
import com.example.aplikasisafe.databinding.ObrolanItemBinding
import com.example.aplikasisafe.model.KomunitasModel
import com.example.aplikasisafe.model.ObrolanModel

class KomunitasAdapter(private val list: List<KomunitasModel>, private val context:Context) :
    RecyclerView.Adapter<KomunitasAdapter.ViewHolder>() {

    class ViewHolder(val binding: KomunitasItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = KomunitasItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivanti.setImageResource(this.image)
                binding.komunitas.text = this.komunitas
                binding.namaakun.text = this.namaakun
                binding.isipost.text = this.isipost
                binding.imgpost.setImageResource(this.img)
            }
        }
    }
}