package com.example.aplikasisafe.Pelatihan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class DaftarKerjaActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_kerja)
        val btnRegisterKerja: Button = findViewById(/* id = */ R.id.btn_registerKerja)
        btnRegisterKerja.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_registerKerja -> {
                val intent = Intent(this@DaftarKerjaActivity, PendaftaranBerhasilActivity::class.java)
                startActivity(intent)
            }
        }
    }
}