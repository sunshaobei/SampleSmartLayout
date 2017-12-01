package com.sunsh.smartlayout.over

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import com.sunsh.layout.overscroll.OverScrollLayout
import com.sunsh.layout.overscroll.OverScrollUtils
import com.sunsh.layout.smartlayout.api.RefreshLayout
import com.sunsh.layout.smartlayout.listener.OnRefreshListener

import com.sunsh.smartlayout.R
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        OverScrollUtils.defaultConfigPullLoad(overscroll_layout)
        overscroll_layout.setOnRefreshListener(object:OverScrollLayout.OnRefreshListener{
            override fun onRefresh() {
                overscroll_layout.postDelayed({overscroll_layout.refreshComplete()},3000)
            }

            override fun onLoading() {
                overscroll_layout.postDelayed({overscroll_layout.loadMoreComplete()},3000)
            }
        })
        listView.adapter = object : BaseAdapter() {
            override fun getCount(): Int {
                return 50
            }

            override fun getItem(position: Int): Any? {
                return null
            }

            override fun getItemId(position: Int): Long {
                return 0
            }

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                var convertView = convertView
                if (convertView == null) {
                    convertView = TextView(this@ListViewActivity)
                    convertView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 80)
                    convertView.textSize = 16f
                    convertView.text = position.toString() + "行"
                    convertView.gravity = Gravity.CENTER
                }
                return convertView
            }
        }
    }
}
