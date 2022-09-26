package com.wcp.checkbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)

        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://chat-bot-testing.netlify.app")
    }
}