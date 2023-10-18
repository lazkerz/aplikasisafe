package com.example.aplikasisafe.pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class DetailPelatihanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pelatihan)
        val btnPelatihan: Button = findViewById(/* id = */ R.id.btn_daftarPelatihan)
        btnPelatihan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_daftarPelatihan -> {
                val intent = Intent(this@DetailPelatihanActivity, DaftarPelatihanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}