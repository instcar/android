package com.instcar.android.entry;

import com.mycommonlib.android.common.util.JSONUtils;
import com.mycommonlib.android.common.util.StringUtils;

public class NetDataEntry {
	public String smsid="";//短信验证码获取smsid
	public String phone="";//短信验证码获取phone	
	public String uid="";//短信验证码获取phone	
	
	
	public NetDataEntry(String jsonString) {
		if(!StringUtils.isEmpty(jsonString)&&!"[]".equals(jsonString)){
			
			this.uid = JSONUtils.getString(jsonString, "uid", "");
			this.smsid = JSONUtils.getString(jsonString, "smsid", "");
			this.phone = JSONUtils.getString(jsonString, "phone", "");
		}else{
			this.smsid = "";
			this.phone = "";
			this.uid = "";
		}
		
	}

	@Override
	public String toString() {
		String s = "smsid="+this.smsid+"phone="+this.phone;
		return s;
	}
	
}
