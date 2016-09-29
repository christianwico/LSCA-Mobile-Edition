package ph.edu.plm.cet.csd.lscaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        // Stop local links and redirects from opening in browser instead of WebView
        mWebView.setWebViewClient(new MyAppWebViewClient());

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("http://lcsa.x10host.com/dashboard.html");
    }
}
