package com.instcar.android.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.instcar.android.entry.NetDataEntry;
import com.mycommonlib.android.common.util.StringUtils;

/**
 * 
 */

@SuppressLint("NewApi")
public class ApplicationVar extends Application {
	private String phone; // 
	private String username; // 
	private String cookie; //
	private String uid; //
	private NetDataEntry userdata; //
	
    
	
	private SharedPreferences pref;
	/**
	 * 
	 */

	public void setUserData(NetDataEntry userdata){
		this.userdata = userdata;
		
	}
	public NetDataEntry getUserData(){
		return this.userdata;
	}

	
	public void setUid(String uid){
		
		if(!StringUtils.isEmpty(uid.trim())){
			SharedPreferences.Editor mEditor = pref.edit();
			mEditor.putString("uid", uid);
			mEditor.commit();
			this.uid = uid;
		}
		
	}
	public String getUid(){
		String s = pref.getString("uid", "");
		this.uid = s;
		return this.uid;
		
	}
public void setStringCookie(String cookie){
	
	if(!StringUtils.isEmpty(cookie.trim())){
		SharedPreferences.Editor mEditor = pref.edit();
		mEditor.putString("cookie", cookie);
		mEditor.commit();
		this.cookie = cookie;
	}
	
}

public String getStringCookie(){
	String s = pref.getString("cookie", "");
	this.cookie = s;
	return this.cookie;
}
	
	@Override
	public void onCreate() {
		pref = PreferenceManager.getDefaultSharedPreferences(this);
		super.onCreate();

		
	}
	
	

}
