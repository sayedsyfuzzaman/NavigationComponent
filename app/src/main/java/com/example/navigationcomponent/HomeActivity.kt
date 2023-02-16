package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragment = HomeFragment()
        val bundle = Bundle()
        bundle.putString("name", intent.getStringExtra("name"))
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)

    }


    override fun onBackPressed() {
        super.onBackPressed()

        //close activity
        finish()
        finishAffinity()
    }
}