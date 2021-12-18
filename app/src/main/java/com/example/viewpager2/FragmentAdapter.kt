package com.example.Viewpager2.FragmentAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.SecondFragment
import com.example.viewpager2.ThirdFragment
import com.example.viewpager2.FirstFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FirstFragment()
            1-> SecondFragment()
            2-> ThirdFragment()
            else -> FirstFragment()
        }
    }


}