package com.example.lab6_androiddesign.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.ViewPagerAdapter
import com.example.lab6_androiddesign.fragment.ClockFragment
import com.example.lab6_androiddesign.fragment.FavoriteFragment
import com.example.lab6_androiddesign.fragment.HomeFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class Bai3 : AppCompatActivity() {

    // Android Developer :)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager = findViewById<ViewPager2>(R.id.viewpager)

        val fragmentList = arrayListOf<Fragment>(HomeFragment(), FavoriteFragment(), ClockFragment())
        val fragmentTitleList = arrayListOf<String>("Home", "Favorite", "Clock")

        tabLayout.apply {
            addTab(newTab().setText("Home"))
            addTab(newTab().setText("Favorite"))
            addTab(newTab().setText("Home"))
        }
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList, fragmentTitleList)

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }
}