package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R

class PelatihanberhasilActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasil_pelatihan)
        val btnBerhasilPelatihan: ImageButton = findViewById(/* id = */ R.id.btn_backpelatihan)
        btnBerhasilPelatihan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_backpelatihan -> {
                val intent = Intent(this@PelatihanberhasilActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}