package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class VerifikasiUser2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_user2)

        val btnYa: Button = findViewById(R.id.button_ya)
        btnYa.setOnClickListener(this)
        val btnTidak: Button = findViewById(R.id.button_tidak)
        btnTidak.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_ya -> {
                val intent = Intent(this@VerifikasiUser2, VerifikasiUser3::class.java)
                startActivity(intent)
            }
            R.id.button_tidak -> {
                val intent = Intent(this@VerifikasiUser2, VerifikasiUser3::class.java)
                startActivity(intent)
            }
        }
    }
}