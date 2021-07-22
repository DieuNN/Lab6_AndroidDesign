package com.example.lab6_androiddesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.lab6_androiddesign.R
import kotlinx.android.synthetic.main.fragment_left2.*
import kotlinx.android.synthetic.main.fragment_right2.*

class FragmentLeft2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_left2, null)
        val buttonSendData:Button = view.findViewById(R.id.button_fragment_left_2)
        buttonSendData.setOnClickListener{
            val fragmentManager = requireActivity().supportFragmentManager
            val rightFragment2 = fragmentManager.findFragmentById(R.id.fragment_right_2)
            rightFragment2!!.textview_fragment_right2.text = edittext_fragment_left2.text.toString()

        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}