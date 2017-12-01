package com.sunsh.smartlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sunsh.smartlayout.smat.WebViewActivity

class SmartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smart)
    }

     fun ListView(view: View) {
    }

     fun RecyclerView(view: View) {

    }

     fun NestedScrollView(view: View) {

    }

     fun WebView(view: View) {
        var intent = Intent(this,WebViewActivity::class.java)
         startActivity(intent)
    }
}
