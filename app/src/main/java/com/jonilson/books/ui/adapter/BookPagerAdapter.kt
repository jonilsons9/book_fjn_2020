package com.jonilson.books.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jonilson.books.ui.fragments.BookFavoritesFragment
import com.jonilson.books.ui.fragments.BookListFragment

class BookPagerAdapter(fa: FragmentActivity):
    FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> BookListFragment()
            else -> BookFavoritesFragment()
        }
}