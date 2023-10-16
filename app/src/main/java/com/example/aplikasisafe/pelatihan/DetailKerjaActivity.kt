package com.example.aplikasisafe.pelatihan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class DetailKerjaActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kerja)
        val btnDetailKerja: Button = findViewById(/* id = */ R.id.btn_daftarKerja)
        btnDetailKerja.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_daftarKerja -> {
                val intent = Intent(this@DetailKerjaActivity, DaftarKerjaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}