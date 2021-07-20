package com.example.lab6_androiddesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.lab6_androiddesign.R
import kotlinx.android.synthetic.main.activity_bai1.*


class FragmentLeft1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_left, container, false)
        val buttonFragmentLeft1:Button = view.findViewById(R.id.button_fragment_left_1)
        val buttonFragmentLeft2:Button = view.findViewById(R.id.button_fragment_left_2)

        buttonFragmentLeft1.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragment_right, FragmentRight1())
                .commit()

        }
        buttonFragmentLeft2.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragment_right, FragmentRight12())
                .commit()
        }
        return view
    }

}