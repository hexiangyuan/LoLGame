package io.github.hexiangyuan.lolgame.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.hexiangyuan.lolgame.BaseFragment
import io.github.hexiangyuan.lolgame.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-8
 */
class MainFragment : BaseFragment() {
    val tabs = arrayOf("最新", "活动", "娱乐", "官方", "攻略", "收藏")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val fragments:Array<Fragment> = arrayOf(MainFragment()
                ,MainFragment()
                ,MainFragment()
                ,MainFragment()
                ,MainFragment()
                ,MainFragment())
        viewPager.adapter = TabAdapter(activity.supportFragmentManager,tabs,fragments)
        tabLayout.setupWithViewPager(viewPager)
    }

    class TabAdapter(fm: FragmentManager, val tabs: Array<String>, val fragments: Array<Fragment>) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment = fragments[position]

        override fun getCount(): Int = tabs.size

        override fun getPageTitle(position: Int): CharSequence = tabs[position]
    }
}