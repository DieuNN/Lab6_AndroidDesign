package com.example.lab6_androiddesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lab6_androiddesign.fragment.ClockFragment
import com.example.lab6_androiddesign.fragment.FavoriteFragment
import com.example.lab6_androiddesign.fragment.HomeFragment
import java.util.ArrayList

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val fragmentList: ArrayList<Fragment>,
    private val fragmentTitleList: ArrayList<String>
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }
}