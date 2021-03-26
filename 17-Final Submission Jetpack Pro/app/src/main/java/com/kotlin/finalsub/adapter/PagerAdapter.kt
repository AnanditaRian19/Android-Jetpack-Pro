package com.kotlin.finalsub.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
class PagerAdapter(
    private val fragmentList: ArrayList<Fragment>,
    fragmentActivity: FragmentActivity,
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}