package com.example.aplikasisafe.pelatihan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.aplikasisafe.R
<<<<<<< HEAD:app/src/main/java/com/example/aplikasisafe/Pelatihan/DaftarPelatihanActivity.kt

=======
>>>>>>> 0683dc5bdb925949a26087aae4be1f8cfd81f5f2:app/src/main/java/com/example/aplikasisafe/pelatihan/DaftarPelatihanActivity.kt

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