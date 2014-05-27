package com.instcar.android;

import java.util.ArrayList;
import java.util.List;

import com.instcar.android.adapter.FavListAdapter;
import com.instcar.android.config.HandleConfig;
import com.instcar.android.entry.Line;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

/**
 * 
 * @author dj880618
 *常用的路线
 */
@SuppressLint({ "NewApi", "HandlerLeak" })
public class CommonWayFragment  extends BaseFrangment{
	
	public ListView listview;
	public List<Line> lineList = new ArrayList<Line>();
 	public FavListAdapter adapter ;
	
 	View v ;
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
		 v = inflater.inflate(
				R.layout.main_framgment_3, container,
				false);
		 View empyty = v.findViewById(R.id.data_empty);
		 empyty.setVisibility(View.GONE);
		 adapter = new FavListAdapter(getActivity(), lineList);
		listview = (ListView) v.findViewById(R.id.listView1);
		listview.setAdapter(adapter);
		listview.setEmptyView(empyty);
		initHandle();
		queryfavlinelist("1", "20");
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}
	
	void initHandle(){
		mHandler = new Handler(){
			@Override
			public void handleMessage(Message msg) {
				// TODO Auto-generated method stub
				switch (msg.what) {
				case HandleConfig.QUERYFAVLIST:
					String data = msg.getData().getString("data");
					
					break;

				default:
					break;
				}
				
				super.handleMessage(msg);
			}
			
			
		};
		
	}
}
