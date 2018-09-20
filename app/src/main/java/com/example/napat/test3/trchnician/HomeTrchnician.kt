package com.example.napat.test3.trchnician

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.napat.test3.R
import com.example.napat.test3.user.test
import kotlinx.android.synthetic.main.activity_home_trchnician.*

class HomeTrchnician : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val trchFragment = TrchFragment.newInstance()
                openFragment(trchFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                val summaryFragment = SummaryFragment.newInstance()
                openFragment(summaryFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                val test = test.newInstance()
                openFragment(test)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container2, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_trchnician)
        val trchFragment = TrchFragment.newInstance()
        openFragment(trchFragment)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
