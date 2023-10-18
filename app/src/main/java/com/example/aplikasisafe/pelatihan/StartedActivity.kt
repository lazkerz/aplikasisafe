package com.example.aplikasisafe.pelatihan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R

class StartedActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_started)
        val btnStarted: Button = findViewById(/* id = */ R.id.btn_getstarted)
        btnStarted.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_getstarted -> {
                val intent = Intent(this@StartedActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}