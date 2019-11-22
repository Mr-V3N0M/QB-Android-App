package dev.danieluac.querobukar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (WebView) findViewById(R.id.WebView);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webview.loadUrl("http://10.178.186.235:5004/");
        webview.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if(webview.canGoBack())
        {
            webview.goBack();
        }else
            super.onBackPressed();
    }
}