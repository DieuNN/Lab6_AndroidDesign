package com.example.lab6_androiddesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lab6_androiddesign.fragment.ClockFragment
import com.example.lab6_androiddesign.fragment.FavoriteFragment
import com.example.lab6_androiddesign.fragment.HomeFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        when (position) {
            1 -> return FavoriteFragment()
            2 -> return ClockFragment()
        }
        return HomeFragment()
    }

    override fun getItemCount(): Int {
        return 3
    }
}