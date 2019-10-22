package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtext1: EditText = findViewById(R.id.edtext_nim)
        val edtext2: EditText = findViewById(R.id.edtext_nama)
        val edtext3: EditText = findViewById(R.id.edtext_nilai)

        btn_proses.setOnClickListener(){
            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("NIM", edtext1.getText().toString())
            intent.putExtra("NAMA", edtext2.getText().toString())
            intent.putExtra("NILAI", edtext3.getText().toString())
            startActivity(intent)
        }
    }
}
