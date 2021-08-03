package com.example.lab6_androiddesign.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.ProductAdapter
import com.example.lab6_androiddesign.model.Product
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_bai1.setOnClickListener {
            startActivity(Intent(this, Bai1::class.java))
        }

        button_bai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }

        button_bai3.setOnClickListener {
            startActivity(Intent(this, Bai3::class.java))
        }

        button_bai4.setOnClickListener {
            startActivity(Intent(this, SanPhamActivity::class.java))
        }
    }

}