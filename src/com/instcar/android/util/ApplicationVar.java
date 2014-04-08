package com.instcar.android.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.mycommonlib.android.common.util.StringUtils;

/**
 * 
 */

@SuppressLint("NewApi")
public class ApplicationVar extends Application {
	private String phone; // 
	private String username; // 
	private String cookie; //
	
    
	
	private SharedPreferences pref;
	/**
	 * 
	 */

	
//public void SetCookie(List<String> cookie){
//	if(cookie!=null){
//		SharedPreferences.Editor mEditor = pref.edit();
//		HashSet< String> set = new HashSet<String>();
//		
//		set.addAll(cookie);
//		mEditor.putStringSet("cookie", set);
//		mEditor.commit();
//		this.cookie = cookie;
//	}
//}
//
//public List<String>  getCookie(){
//	
//	
//	Set<String> set  = pref.getStringSet("cookie", null);
//	List <String> list  = new ArrayList<String>();
//	if(set!=null){
//		list.addAll(set);
//	}
//	this.cookie  = list;
//	
//	return this.cookie;
//}

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
