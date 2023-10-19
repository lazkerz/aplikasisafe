package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.R

class TemaAdapter(private val temaList: ArrayList<TemaPelatihan>) :
    RecyclerView.Adapter<TemaAdapter.TemaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemaHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pelatihan_item, parent, false)
        return TemaHolder(itemView)
    }

    override fun getItemCount(): Int {
        return temaList.size
    }

    override fun onBindViewHolder(holder: TemaHolder, position: Int) {
        val pelatihanItemUy = temaList[position]
        holder.imgPelatihan.setImageResource(pelatihanItemUy.imageResId)
        holder.namaPelatihan.text = pelatihanItemUy.nama
        holder.descPelatihan.text = pelatihanItemUy.deskripsi

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, PilihanPelatihanActivity::class.java)

            // Anda dapat menambahkan data tambahan ke intent jika diperlukan
            intent.putExtra("nama_pelatihan", pelatihanItemUy.nama)
            intent.putExtra("deskripsi_pelatihan", pelatihanItemUy.deskripsi)

            context.startActivity(intent)
        }
    }

    class TemaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPelatihan: ImageView = itemView.findViewById(R.id.imgPelatihan)
        val namaPelatihan: TextView = itemView.findViewById(R.id.namaPelatihan)
        val descPelatihan: TextView = itemView.findViewById(R.id.deskPelatihan)
    }
}
