package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.Viewpager2.FragmentAdapter.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabBar: TabLayout
    private lateinit var viewPager: ViewPager2

    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        tabBar = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabBar,viewPager){tab,position->

            when(position){

                0-> tab.text = "My"
                1-> tab.text = "Childhood"
                2-> tab.text = "Photo"
            }

        }.attach()




    }
}