package com.example.lab6_androiddesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.ProductAdapter
import com.example.lab6_androiddesign.model.Product
import kotlinx.android.synthetic.main.activity_test.*
import java.util.ArrayList

class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val productList = ArrayList<Product>().apply {
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
        }

        val listTest = arrayListOf<String>("test1", "test 2", "test3")

        listview_test.adapter  = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listTest)
    }
}