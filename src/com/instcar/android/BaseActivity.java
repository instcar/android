package com.instcar.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.instcar.android.util.ApplicationVar;
import com.mycommonlib.android.common.util.ToastUtils;
/**
 * 
 * @dujie
 * 
 */
public class BaseActivity extends Activity {

	
	
	
	public ApplicationVar av;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		av = (ApplicationVar) getApplication();
	}
	
	public void showToastError(String message){
		ToastUtils.show(this, message);
	}
	public void setEditStatus(EditText e,int status){
		
		if(status==1){//成功
    		e.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.ic_agree_ok,0);
		}else{
			e.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.ic_agree_no,0);
		}
	}

}
