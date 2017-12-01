package com.sunsh.smartlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun OverScroll(view: View) {
        val intent = Intent(this, OverScrollActivity::class.java)
        startActivity(intent)
    }

     fun Smart(view: View) {
        val intent = Intent(this, SmartActivity::class.java)
        startActivity(intent)
    }

}
