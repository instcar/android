package com.instcar.android;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.instcar.android.UploadCar1Fragment.onBandClickListener;
import com.instcar.android.sortlistview.SortModel;


@SuppressLint("NewApi")
public class VerfyCarActivity extends BaseActivity  {
	private View frangmentContainer;//容器
	
	private UploadCar1Fragment uploadCar1Fragment;
	private UploadCar2Fragment uploadCar2Fragment;
	private UploadCar3Fragment uploadCar3Fragment;
	FragmentTransaction ft;
	private SortModel band;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.verfy_car_main);
		initBaseNav();
		navbar.setText("汽车认证");
		navbar2.setText("请选择汽车品牌");
		
		frangmentContainer = findViewById(R.id.verfy_car_layout_container);
		
		FragmentManager fragmentManager = getFragmentManager();
		ft = fragmentManager.beginTransaction();
		uploadCar1Fragment = new UploadCar1Fragment();
		uploadCar1Fragment.setCallBack(new onBandClickListener() {
			
			@Override
			public void click(SortModel band) {
				VerfyCarActivity.this.band=band;
				
				
			}
		});
		ft.add(R.id.verfy_car_layout_container, uploadCar1Fragment, "upload1");
		ft.commit();
	}

	
	
}
