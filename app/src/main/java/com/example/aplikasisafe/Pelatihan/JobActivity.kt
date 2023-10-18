package com.example.aplikasisafe.Pelatihan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.R

class JobActivity : AppCompatActivity() {

    private lateinit var kerjaViewImage : RecyclerView
    private lateinit var kerjaArrayListen: ArrayList<CariKerja>
    private lateinit var kerjaArrayListed : ArrayList<CariKerja>
    lateinit var imageKerjaPt : Array<Int>
    lateinit var namaKerjaPt : Array<String>
    lateinit var desKerjaPt : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        imageKerjaPt = arrayOf(
            R.drawable.kerja1,
            R.drawable.kerja2,
            R.drawable.kerja3,
            R.drawable.kerja4,
            R.drawable.kerja5,
            R.drawable.kerja6,
            R.drawable.kerja7
        )

        namaKerjaPt = arrayOf(
            "Content Creator",
            "Web Developer",
            "Backend Engineer",
            "Graphic Design",
            "Digital Marketing",
            "Wiraswasta",
            "Koki Restoran"
        )

        desKerjaPt = arrayOf(
            "PT Mencari Aman",
            "PT Sejahtera Aman",
            "PT Dev Academy",
            "PT Aman Sentosa",
            "PT Aman Jaya",
            "PT Suka Maju",
            "PT Aman Jaya"
        )
        // Inisialisasi RecyclerView
        kerjaViewImage = findViewById(R.id.kerjaRecyclerView)
        kerjaViewImage.layoutManager = LinearLayoutManager(this)

        // Inisialisasi ArrayList yang akan digunakan untuk RecyclerView
        kerjaArrayListen = ArrayList()
        for (i in imageKerjaPt.indices) {
            val cariKerja = CariKerja(imageKerjaPt[i], namaKerjaPt[i], desKerjaPt[i])
            kerjaArrayListen.add(cariKerja)
        }

        // Inisialisasi adapter
        val adapter = KerjaAdapter(kerjaArrayListen)
        kerjaViewImage.adapter = adapter
    }
}