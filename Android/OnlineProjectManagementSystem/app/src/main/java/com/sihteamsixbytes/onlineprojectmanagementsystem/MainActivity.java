package com.sihteamsixbytes.onlineprojectmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove the status bar and make it full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        webView = findViewById(R.id.appWebView);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportMultipleWindows(false);

        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUserAgentString("Team 6 Bytes");

        String url = "https://www.sih.gov.in/";
        loadURL(url);
    }

    private void loadURL(String url) {
        webView.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
