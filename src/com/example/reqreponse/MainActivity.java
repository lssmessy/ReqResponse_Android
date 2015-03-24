package com.example.reqreponse;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void makeReq(String toPost){
		HttpClient httpclient=new DefaultHttpClient();
		HttpPost httpPost=new HttpPost("http://whtsnext.cuccfree.com/");
		
		String myName="test message";
		try{
			List<NameValuePair> namevaluepairs=new ArrayList<NameValuePair>(1);
			namevaluepairs.add(new BasicNameValuePair("action", myName));
			
		}catch(Exception e){}
	}

}
