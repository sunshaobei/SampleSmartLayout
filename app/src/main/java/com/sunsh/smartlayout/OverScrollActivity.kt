package com.sunsh.smartlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sunsh.smartlayout.over.ListViewActivity
import com.sunsh.smartlayout.over.NesteScrollViewActivity
import com.sunsh.smartlayout.over.RecyclerViewActivity
import com.sunsh.smartlayout.over.WebViewActivity

class OverScrollActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_scroll)
    }

    fun ListView(view: View) {
        var intent = Intent(this, ListViewActivity::class.java)
        startActivity(intent)
    }

    fun RecyclerView(view: View) {
        var intent = Intent(this, NesteScrollViewActivity::class.java)
        startActivity(intent)
    }

    fun NesteScrollView(view: View) {
        var intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }

    fun WebView(view: View) {
        var intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }
}
