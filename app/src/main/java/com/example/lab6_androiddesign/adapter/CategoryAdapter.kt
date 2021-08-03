package com.example.lab6_androiddesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.model.Category

class CategoryAdapter(context: Context, resource:Int, val categoryList:ArrayList<Category>): ArrayAdapter<Category>(context, 0, categoryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_row, null)
        val categoryName = view.findViewById<TextView>(R.id.textview_category_name)
        val categoryDescription = view.findViewById<TextView>(R.id.textview_category_description)

        categoryName.text = categoryList[position].name
        categoryDescription.text = categoryList[position].description

        return view
    }
}