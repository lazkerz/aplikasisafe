package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.Pelatihan.PilihanPelatihanActivity
import com.example.aplikasisafe.Pelatihan.TemaAdapter
import com.example.aplikasisafe.Pelatihan.TemaPelatihan
import com.example.aplikasisafe.R

class TemaPelatihanActivity : AppCompatActivity() {
    private lateinit var LatihanViewImage: RecyclerView
    private lateinit var LatihanArrayListen: ArrayList<TemaPelatihan>
    lateinit var imagePelatihanuy: Array<Int>
    lateinit var namaPelatihanuy: Array<String>
    lateinit var deskPelatihan: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tema_pelatihan)

        imagePelatihanuy = arrayOf(
            R.drawable.task1,
            R.drawable.task2,
            R.drawable.task3,
            R.drawable.task4,
            R.drawable.task5,
            R.drawable.task6,
            R.drawable.task7
        )

        namaPelatihanuy = arrayOf(
            "WIRAUSAHA",
            "PELATIHAN DIGITAL",
            "PENDIDIKAN",
            "SENI DAN SASTRA",
            "TEKNIK DAN INDUSTRI",
            "GEOGRAFIS",
            "BERDASARKAN KETERAMPILAN"
        )

        deskPelatihan = arrayOf(
            "Mempelajari bagaimana membangun usaha dari awal",
            "Belajar teknik komputer serta software yang bermanfaat",
            "Pekerjaan yang bertugas untuk memimpin sebuah lembaga pendidikan.",
            "Para seniman yang membuat lukisan untuk dipamerkan di galeri",
            "Bertugas untuk menjamin mutu material dan mutu hasil pelaksanaan",
            "Dapat dilakukan oleh yang berlatar belakang geografis seperti nelayan",
            "Tenaga kerja terdidik, dan Tenaga kerja terampil, serta pekerja kasar"
        )

        // Inisialisasi RecyclerView
        LatihanViewImage = findViewById(R.id.latihanRecyclerView)
        LatihanViewImage.layoutManager = LinearLayoutManager(this)

        // Inisialisasi ArrayList yang akan digunakan untuk RecyclerView
        LatihanArrayListen = ArrayList()
        for (i in imagePelatihanuy.indices) {
            val temaPelatihan = TemaPelatihan(imagePelatihanuy[i], namaPelatihanuy[i], deskPelatihan[i])
            LatihanArrayListen.add(temaPelatihan)
        }

        // Inisialisasi adapter
        val adapter = TemaAdapter(LatihanArrayListen)
        LatihanViewImage.adapter = adapter

        // Tambahkan listener klik ke adapter
        adapter.setItemClickListener { position ->
            // Start aktivitas baru ketika CardView diklik
            val intent = Intent(this, PilihanPelatihanActivity::class.java)
            startActivity(intent)
        }
    }
}
