package com.example.javaapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class web_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

    WebView browser = findViewById(R.id.website);
    browser.loadUrl("https://kun.uz/");
    WebSettings webSettings = browser.getSettings();
    webSettings.setJavaScriptEnabled(true);
    }

}
