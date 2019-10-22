package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textview1: TextView = findViewById(R.id.text_view_nim)
        val textview2: TextView = findViewById(R.id.text_view_nama)
        val textview3: TextView = findViewById(R.id.text_view_nilai)
        val textview4: TextView = findViewById(R.id.text_view_keterangan)

        textview1.setText(intent.getStringExtra("NIM"))
        textview2.setText(intent.getStringExtra("NAMA"))
        textview3.setText(intent.getStringExtra("NILAI"))

        val nilai_angka: Int = (intent.getStringExtra("NILAI").toInt())

        if (nilai_angka >= 80 && nilai_angka <= 100){
            textview4.setText("A")
        } else if (nilai_angka >= 60 && nilai_angka < 80){
            textview4.setText("B")
        } else if (nilai_angka >= 40 && nilai_angka < 60){
            textview4.setText("C")
        } else if (nilai_angka >= 20 && nilai_angka < 40){
            textview4.setText("D")
        } else if (nilai_angka >= 0 && nilai_angka < 20){
            textview4.setText("E")
        }

        btn_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

