package com.example.aplikasisafe.potensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatButton
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R

class PotensiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potensi)

        val back = findViewById<ImageButton>(R.id.back) // Gantilah Button dengan tipe yang sesuai jika perlu
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup aktivitas saat kembali ke MainActivity (opsional)
        }

        val btnKomunitas = findViewById<AppCompatButton>(R.id.btn_komunitas)
        btnKomunitas.setOnClickListener {
            val fragment = KomunitasFragment() // Gantilah dengan fragment "Komunitas" yang sesungguhnya
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }

        // Menghubungkan tombol "Kegiatan" dengan tindakan untuk menampilkan fragment "Kegiatan"
        val btnKegiatan = findViewById<AppCompatButton>(R.id.btn_kegiatan)
        btnKegiatan.setOnClickListener {
            val fragment = KegiatanFragment() // Gantilah dengan fragment "Kegiatan" yang sesungguhnya
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }

}
