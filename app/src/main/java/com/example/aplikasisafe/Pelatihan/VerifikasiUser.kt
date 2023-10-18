package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R
import com.example.aplikasisafe.ui.home.HomeFragment

class VerifikasiUser : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_user)

        val lewati: TextView = findViewById(R.id.textView3)
        lewati.setOnClickListener(this)
        val btnYa: Button = findViewById(R.id.button_ya)
        btnYa.setOnClickListener(this)
        val btnTidak: Button = findViewById(R.id.button_tidak)
        btnTidak.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.textView3 -> {
                val intent = Intent(this@VerifikasiUser, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.button_ya -> {
                val intent = Intent(this@VerifikasiUser, VerifikasiUser2::class.java)
                startActivity(intent)
            }
            R.id.button_tidak -> {
                val intent = Intent(this@VerifikasiUser, VerifikasiUser2::class.java)
                startActivity(intent)
            }
        }
    }
}