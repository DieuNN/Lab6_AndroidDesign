package com.example.lab6_androiddesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.CategoryAdapter
import com.example.lab6_androiddesign.model.Category


class FragmentCategory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)
        val listView = view.findViewById<ListView>(R.id.listview_category)

        val categoryList = arrayListOf<Category>().apply {
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))
            add(Category("Sua tuoi", "Sua tuoi nguyen chat 100%"))

        }

        listView.adapter = CategoryAdapter(requireContext(), R.layout.category_row, categoryList)

        return view
    }

}