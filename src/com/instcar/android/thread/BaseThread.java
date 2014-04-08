package com.instcar.android.thread;

import com.instcar.android.service.BaseService;

import android.os.Handler;

public class BaseThread {
	Handler handle;
	BaseService service;
	public void setHandle(Handler h){
		this.handle=h;
		
	}
	public void setService(BaseService service){
		this.service = service;
	}
	
}
