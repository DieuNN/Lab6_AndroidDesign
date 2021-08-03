package com.example.lab6_androiddesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.lab6_androiddesign.R
import com.example.lab6_androiddesign.adapter.ViewPagerAdapter
import com.example.lab6_androiddesign.fragment.FragmentCategory
import com.example.lab6_androiddesign.fragment.FragmentProduct
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.san_pham_activity.*

class SanPhamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.san_pham_activity)

        tab_layout_san_pham.apply {
            addTab(newTab().setText(resources.getString(R.string.product)))
            addTab(newTab().setText(resources.getString(R.string.category)))
        }

        val fragmentList = arrayListOf<Fragment>(FragmentProduct(), FragmentCategory())
        val fragmentTitleList = arrayListOf<String>(resources.getString(R.string.product), resources.getString(R.string.category))
        viewpager2_san_pham.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList, fragmentTitleList )

        tab_layout_san_pham.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpager2_san_pham.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewpager2_san_pham.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tab_layout_san_pham.selectTab(tab_layout_san_pham.getTabAt(position))
            }
        })
    }
}