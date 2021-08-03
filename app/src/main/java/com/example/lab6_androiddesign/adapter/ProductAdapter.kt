package com.example.lab6_androiddesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.model.Product
import java.util.ArrayList

class ProductAdapter(context: Context, private val resource: Int, var productList: ArrayList<Product> ) : ArrayAdapter<Product>(context, 0, productList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(resource, null)

        val productName = view.findViewById<TextView>(R.id.textview_product_name)
        val productDescription = view.findViewById<TextView>(R.id.textview_product_description)

        productName.text = productList[position].name
        productDescription.text = productList[position].description

        return view
    }
}