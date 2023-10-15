package com.example.projectmacro8

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DaftarPelatihanActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_pelatihan)
        val btnDaftarPelatihan: Button = findViewById(/* id = */ R.id.btnDaftar1)
        btnDaftarPelatihan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnDaftar1 -> {
                val intent = Intent(this@DaftarPelatihanActivity, KonfirmasiPelatihanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}