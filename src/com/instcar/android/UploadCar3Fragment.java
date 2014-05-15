package com.instcar.android;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * 
 *用户选择的煮界面
 * @author dj880618
 *
 */
@SuppressLint("NewApi")
public class UploadCar3Fragment  extends Fragment{
	
	ImageButton usecar;
	ImageButton havecar;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/**
	 * The Fragment's UI is just a simple text view showing its instance
	 * number.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(
				R.layout.main_framgment_1, container,
				false);
		
		usecar  =(ImageButton) v.findViewById(R.id.use_car);
		havecar  =(ImageButton) v.findViewById(R.id.have_car);
		usecar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		havecar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), HaveCarV2Activity.class);
			//	Intent i = new Intent(getActivity(), HaveCarCreateActivity.class);
				startActivity(i);
			}
		});
		
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

}
