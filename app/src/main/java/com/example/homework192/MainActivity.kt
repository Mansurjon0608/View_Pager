package com.example.homework192

import Adapter.MyFragmentAdapter
import Fragment.FourFragment
import Fragment.OneFragment
import Fragment.ThreeFragment
import Fragment.TwoFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    lateinit var list : ArrayList<Fragment>
    lateinit var myFragment: MyFragmentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        loadData()
        myFragment = MyFragmentAdapter(list, supportFragmentManager)
        view_pager.adapter = myFragment
        dots_indicator.setViewPager(view_pager)

        otkazish1.setOnClickListener {
            if (view_pager.currentItem==3) {
            view_pager.setCurrentItem(0)
            }
            else
            view_pager.currentItem = view_pager.currentItem+1

        }


    }

    private fun loadData() {
        list = ArrayList()

        list.add(OneFragment())
        list.add(TwoFragment())
        list.add(ThreeFragment())
        list.add(FourFragment())
    }
}