package com.example.aplikasisafe.pelatihan

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


    @SuppressLint("MissingInflatedId")
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

        kerjaViewImage = findViewById(R.id.title_kerja)
        kerjaViewImage.layoutManager = LinearLayoutManager(this)
        kerjaViewImage.setHasFixedSize(true)

        kerjaArrayListen = arrayListOf<CariKerja>()
        kerjaArrayListed = arrayListOf<CariKerja>()
        getUserKerja()

    }

    private fun getUserKerja() {
        for(i in imageKerjaPt.indices){
            val cariKerja = CariKerja(imageKerjaPt[i], namaKerjaPt[i], desKerjaPt[i])
            kerjaArrayListed.add(cariKerja)
            kerjaArrayListen.add(cariKerja)
        }
        kerjaViewImage.adapter = KerjaAdapter(kerjaArrayListed)
        kerjaViewImage.adapter = KerjaAdapter(kerjaArrayListen)
    }
}