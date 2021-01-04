package com.example.contador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var message : TextView
    private var counter: Int = 0
    private lateinit var click : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click = findViewById<ImageView>(R.id.image)
        click.setOnClickListener { tapImage() }
    }

    private fun tapImage() {
        counter++

        val total = when(counter) {
            1 -> "once"
            2 -> "twice"
            else -> "$counter times"
        }
        message = findViewById<TextView>(R.id.textChange)
        message.text = "You touched the image $total"
    }
}