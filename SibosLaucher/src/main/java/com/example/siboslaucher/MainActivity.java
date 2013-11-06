package com.example.siboslaucher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        openBrowser();
    }

    private void openBrowser () {
        String url = "http://yyaayyaatt.wordpress.com/2013/07/25/load-data-dari-database-ke-component-combobox/";

        //Menginstantiasi webchrome client baru, buat gaya-gayaan aja B)
        WebChromeClient wcc = new WebChromeClient();
        webView.setWebChromeClient(wcc);
        //mengaktifkan javascript, kalo nggak aktif... TRY IT!
        webView.getSettings().setJavaScriptEnabled(true);
        //mengaktifkan built in zoom controls
        webView.getSettings().setBuiltInZoomControls(true);
        //bagian ini akan dijelaskan
        //webView.enablePlatformNotifications();
        //meload URL
        webView.loadUrl(url);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
