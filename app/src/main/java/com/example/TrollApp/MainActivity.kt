package com.example.TrollApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val key = "Nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            val text = editText.text.toString()
            if(text == "") {
                Toast.makeText(this , "Inserire un nome valido" , Toast.LENGTH_SHORT).show()
            }
            else {
                val i = Intent(this , MainActivity2::class.java)
                i.putExtra(key, text)
                startActivity(i)
            }
        }

    }
}