package com.example.aplikasisafe.Pelatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnkeDashboard:Button = findViewById(R.id.btn_masuk)
        btnkeDashboard.setOnClickListener(this)
        val btnkeDaftar:Button = findViewById(R.id.btn_register)
        btnkeDaftar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_register-> {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_masuk-> {
                val intent = Intent(this@LoginActivity, VerifikasiUser::class.java)
                startActivity(intent)
            }
        }
    }
}