package com.hienqp.collectnewsrssapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DetailContentOfTitleActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_content_of_title);

        webView = (WebView) findViewById(R.id.webView_display_detail_content_of_title);

        Intent intent = getIntent();
        String link = intent.getStringExtra("title_link");

        webView.loadUrl(link);

        // thiết lập nếu có đường dẫn khác được kích hoạt trong WebView hiện tại, sẽ không mở đường
        // dẫn đó ở Activity Browser hệ thống, mà vẫn mở trong WebView hiện tại của ứng dụng
        webView.setWebViewClient(new WebViewClient());
    }
}