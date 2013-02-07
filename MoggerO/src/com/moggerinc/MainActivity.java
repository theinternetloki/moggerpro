package com.moggerinc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebSettings;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("http://www.stmgang.com/app/posts.html");
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return false;

	}
	
	}


