package com.example.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        editText = findViewById(R.id.editText)
        val maxLength = 8
        editText.filters = arrayOf(InputFilter.LengthFilter(maxLength))
        Toast.makeText(this,"Password should be 8 Character", Toast.LENGTH_SHORT).show()
    }
}