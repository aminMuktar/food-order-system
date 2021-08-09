package com.example.mobile_app_project;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Wb1 extends AppCompatActivity {
    WebView wb;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wb_view1);
        wb = (WebView) findViewById(R.id.webs);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://www.moamin.github.io");
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
