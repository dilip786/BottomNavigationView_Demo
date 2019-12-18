package com.example.bottomnavigationview_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        attachFragment(FirstFragment())

        bNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    attachFragment(FirstFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_history -> {
                    attachFragment(SecondFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_my_account -> {
                    attachFragment(ThirdFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    private fun attachFragment(fragment: Fragment) {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, fragment)
        fragmentTransaction.commit()
    }
}
