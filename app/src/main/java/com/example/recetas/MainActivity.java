package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.WVPrincipal);


        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webSettings.setJavaScriptEnabled(true);


        webView.loadUrl("http://185.254.206.236/");
//webView.loadUrl("http://185.254.206.236/");
        webView.setWebViewClient(new WebViewClient());


    }
}