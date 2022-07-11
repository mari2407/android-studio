package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edittext:EditText
    lateinit var edittext2:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittext=findViewById(R.id.edittext)
        edittext2=findViewById(R.id.edittext2)
        button=findViewById(R.id.button)
        button.setOnClickListener{
            if (edittext.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Please enter your name",Toast.LENGTH_SHORT).show()
            }
            else if (edittext2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"please enter your pasward",Toast.LENGTH_SHORT).show()

            }
        }
    }
}