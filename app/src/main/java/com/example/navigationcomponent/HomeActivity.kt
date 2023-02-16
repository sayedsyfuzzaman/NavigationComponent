package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragment = HomeFragment()
        val bundle = Bundle()
        bundle.putString("name", intent.getStringExtra("name"))
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()


    }


    override fun onBackPressed() {
        super.onBackPressed()

        //close activity
        finish()
        finishAffinity()
    }
}