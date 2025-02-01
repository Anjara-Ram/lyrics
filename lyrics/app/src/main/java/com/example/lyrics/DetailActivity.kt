package com.example.lyrics

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val getData = intent.getParcelableExtra<DataClass>("android")
        if (getData != null) {
            val couplet : TextView = findViewById(R.id.couplet)
            val title : TextView = findViewById(R.id.title)

            couplet.text = getData.dataCouplet
            title.text = getData.dataTitle.toUpperCase(Locale.getDefault())
        }


    }
}