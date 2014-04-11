package com.instcar.android;

import com.instcar.android.StartActivity.ArrayListFragment;
import com.instcar.android.util.MyLog;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
/**
 * 
 * 
 * @author dj880618
 */
public class MainActivity extends BaseActivity {

	
	ViewPager mPager; //左右滑动的框
	Button btn_opt1;//左边的操作按钮
	Button btuser;//用户
	Button btsetting;//设置按钮
	
	TextView tv;//显示提示信息用的
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_main2);
		
		mPager = (ViewPager) findViewById(R.id.pager);
		
		tv = (TextView) findViewById(R.id.textView1);
		btn_opt1 = (Button) findViewById(R.id.button_opt);
		btuser =(Button) findViewById(R.id.button_user);
		btsetting = (Button) findViewById(R.id.button_set);
		
		
		
		
		
		
		
		
		
	}
	public  class MyAdapter extends FragmentStatePagerAdapter {
		public MyAdapter(FragmentManager fm) {
			super(fm);
		}
		
		@Override
		public int getCount() {
			return 3;
		}
		
		@Override
		public Fragment getItem(int position) {
			MyLog.d(position+"==position");
			
			Bundle args = new Bundle();
			args.putInt("num", position);
			Fragment f = null ;
			switch (position) {
				case 0:
					f = new ChoiceFragment();
					break;
				case 1:
					f = new TodayWayFragment();
					break;
				case 2:
					f = new CommonWayFragment();
					break;
	
				default:
					f = new ChoiceFragment();
					break;
			}
			return f;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
