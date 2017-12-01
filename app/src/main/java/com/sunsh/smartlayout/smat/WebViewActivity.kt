package com.sunsh.smartlayout.smat

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient

import com.sunsh.smartlayout.R
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view2)

        webView.settings.javaScriptEnabled = true
        webView.loadUrl("http://baidu.com")
        webView.webViewClient = WebViewClient()

    }
}
