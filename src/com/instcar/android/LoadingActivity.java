package com.instcar.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
/*
 *@dujie 
 */
public class LoadingActivity extends BaseActivity {

	private Handler mHandler = new Handler(){ 
        
        public void handleMessage(Message msg) { 
            switch (msg.what) { 
            case 1: 
            	Intent intent = new Intent();  
                intent.setClass(LoadingActivity.this, StartActivity.class);  
                  
                startActivity(intent);  
            	
                LoadingActivity.this.finish();
                break; 
            } 
        }; 
    }; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_load);
		 Message message = new Message(); 
         message.what = 1; 
         mHandler.sendMessageDelayed(message, 1000); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
