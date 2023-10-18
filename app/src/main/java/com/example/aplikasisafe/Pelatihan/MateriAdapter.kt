//package com.example.aplikasisafe.Pelatihan
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.aplikasisafe.R
//
//class MateriAdapter(private val materiList: ArrayList<MateriPelatihan>) :
//    RecyclerView.Adapter<MateriAdapter.MateriHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.materi_item, parent, false)
//        return MateriHolder(itemView)
//    }
//
//    override fun getItemCount(): Int {
//        return materiList.size
//    }
//
//    override fun onBindViewHolder(holder: MateriHolder, position: Int) {
//        val materiItemUy = materiList[position]
//        holder.namaMateri.text = materiItemUy.namaMateri
//        holder.descMateri.text = materiItemUy.deskMateri
//    }
//
//    class MateriHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val namaMateri: TextView = itemView.findViewById(R.id.tv_materi)
//        val descMateri: TextView = itemView.findViewById(R.id.desc_materi)
//    }
//}