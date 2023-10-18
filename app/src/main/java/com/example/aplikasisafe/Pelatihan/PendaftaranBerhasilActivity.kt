package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.MainActivity
import com.example.aplikasisafe.R

class PendaftaranBerhasilActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendaftaran_berhasil)
        val btnBerhasilDaftarUy: Button = findViewById(/* id = */ R.id.btn_okehBehasil)
        btnBerhasilDaftarUy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_okehBehasil -> {
                val intent = Intent(this@PendaftaranBerhasilActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}