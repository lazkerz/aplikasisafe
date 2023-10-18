package com.example.aplikasisafe.Pelatihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.R

class KerjaAdapter(private val kerjaList : ArrayList<CariKerja>) :
    RecyclerView.Adapter<KerjaAdapter.KerjaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KerjaHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.kerja_item, parent, false)
        return KerjaHolder(itemView)
    }

    override fun getItemCount(): Int {
        return kerjaList.size
    }

    override fun onBindViewHolder(holder: KerjaHolder, position: Int) {

        val kerjaItemUy = kerjaList[position]
        holder.titleImage.setImageResource(kerjaItemUy.titleImage)
        holder.namaPt.text = kerjaItemUy.namaPt
        holder.tvdeskripsi.text = kerjaItemUy.tvdeskripsi
    }

    class KerjaHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val titleImage : ImageView = itemView.findViewById(R.id.title_kerja)
        val namaPt : TextView = itemView.findViewById(R.id.title_pt)
        val tvdeskripsi : TextView = itemView.findViewById(R.id.title_desc)

    }
}