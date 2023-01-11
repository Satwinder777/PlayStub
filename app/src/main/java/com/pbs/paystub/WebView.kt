package com.pbs.paystub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.ImageView

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val imageView = findViewById<ImageView>(R.id.imageView2)

        imageView.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val webView = findViewById<android.webkit.WebView>(R.id.webViewId1)

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://paystubscheck.com/")

        webView.settings.javaScriptEnabled = true

        webView.settings.setSupportZoom(true)



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}