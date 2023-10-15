package com.example.projectmacro8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KonfirmasiPelatihanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_pelatihan)
        val btnKonfimasiPelatihan: Button = findViewById(/* id = */ R.id.btn_ok)
        btnKonfimasiPelatihan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_ok -> {
                val intent = Intent(this@KonfirmasiPelatihanActivity,BerhasilPelatihanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}