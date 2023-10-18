package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.R
import com.example.aplikasisafe.adapters.MateriAdapter
import com.example.aplikasisafe.model.MateriModel

class PilihanPelatihanActivity : AppCompatActivity() {

    private lateinit var adapter: MateriAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan_pelatihan)

        recyclerView = findViewById(R.id.materiRecyclerView)

        // Set the layout manager for the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize and set the adapter for the RecyclerView
        val dataList: MutableList<MateriModel> = mutableListOf()

        // Replace the following lines with your data source methods
        materi().forEachIndexed { index, materi ->
            dataList.add(MateriModel(materi, desc()[index]))
        }

        adapter = MateriAdapter(dataList, this)
        recyclerView.adapter = adapter
    }

    // Replace these functions with your actual data source methods
    private fun materi(): Array<String> = resources.getStringArray(R.array.materi)
    private fun desc(): Array<String> = resources.getStringArray(R.array.desc)
}
