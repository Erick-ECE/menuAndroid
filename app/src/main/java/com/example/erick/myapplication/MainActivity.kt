package com.example.erick.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.MenuItem

class MainActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState, persistentState)
        setUpToolbar()
    }

    private fun setUpToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar_main)
        val actionBar = supportActionBar
        setSupportActionBar(toolbar)
        actionBar?.apply {
            setHomeAsUpIndicator(R.drawable.abc_ic_menu_paste_mtrl_am_alpha)
            setDisplayHomeAsUpEnabled(true)
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        when(itemId) {
            R.id.menu_first_option -> {  }

            R.id.menu_second_option -> {  }

            R.id.menu_third_option -> {  }
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        when(item?.itemId) {
            android.R.id.home -> {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    drawerLayout.openDrawer(GravityCompat.START)
                }
            }
        }

        return super.onOptionsItemSelected(item)
    }
}