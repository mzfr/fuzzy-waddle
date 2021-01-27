package com.example.codeql;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Uri URL = intent.getData();

        if (URL.getHost().equals("mzfr.me")){
            Log.e("mzfr", "check bypassed");
            setContentView(R.layout.activity_second);
            WebView myWebView = (WebView) findViewById(R.id.webview);
            myWebView.loadUrl(String.valueOf(URL));
        } else {
            Log.e("mzfr", "Hatt Saale");
        }
    }
}
