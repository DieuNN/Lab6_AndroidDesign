package com.example.lab6_androiddesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.ProductAdapter
import com.example.lab6_androiddesign.model.Product
import java.util.ArrayList


class FragmentProduct : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_product, container, false)

        val listView = view.findViewById<ListView>(R.id.list_product_item)
        val productList = ArrayList<Product>().apply {
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
            add(Product("Vinamilk", "Sua tuoi"))
        }

        listView.adapter = ProductAdapter(requireContext(), R.layout.product_row, productList)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}