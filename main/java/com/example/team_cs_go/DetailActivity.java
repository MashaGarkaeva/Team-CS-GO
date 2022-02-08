package com.example.team_cs_go;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WebView webView = findViewById(R.id.web);
        TextView textView = findViewById(R.id.arrays);

        String arrays = getIntent().getStringExtra("arrays");
        switch (arrays){
            case ("nafany"):
                textView.setText(arrays);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://gambit.gg/players/nafany");
                break;
            case ("interz"):
                textView.setText(arrays);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://gambit.gg/players/interz");
                break;
            case ("Ax1Le"):
                textView.setText(arrays);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://gambit.gg/players/ax1le");
                break;
            case ("sh1ro"):
                textView.setText(arrays);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://gambit.gg/players/sh1r0");
                break;
            case ("Hobbit"):
                textView.setText(arrays);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://gambit.gg/players/hobbit");
                break;

        }
    }
}