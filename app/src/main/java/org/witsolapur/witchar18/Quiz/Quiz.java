package org.witsolapur.witchar18.Quiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.witsolapur.witchar18.R;

public class Quiz extends AppCompatActivity {

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);

        webview = (WebView)findViewById(R.id.web);
        WebSettings webSetting = webview.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://goo.gl/forms/QchMcLXaFVM3SlCX2");

        webview.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }

}