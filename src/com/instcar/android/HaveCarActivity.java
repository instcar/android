package com.instcar.android;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Toast;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.map.MKMapViewListener;
import com.baidu.mapapi.map.MapController;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.OverlayItem;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/**
 * 演示MapView的基本用法
 */
public class HaveCarActivity extends BaseActivity {

	final static String TAG = "MainActivity";
	/**
	 *  MapView 是地图主控件
	 */
	/**
	 *  用MapController完成地图控制 
	 */
	private MapController mMapController = null;
	/**
	 *  MKMapViewListener 用于处理地图事件回调
	 */
	MKMapViewListener mMapListener = null;
	BMapManager mBMapMan = null;  
	MapView mMapView = null;  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBMapMan=new BMapManager(getApplication());  
        mBMapMan.init(null);   
        //注意：请在试用setContentView前初始化BMapManager对象，否则会报错  
        setContentView(R.layout.have_car_main);  
        mMapView=(MapView)findViewById(R.id.bmapView);  
        mMapView.setBuiltInZoomControls(false);  
        //设置启用内置的缩放控件  
        MapController mMapController=mMapView.getController();  
        // 得到mMapView的控制权,可以用它控制和驱动平移和缩放  
        GeoPoint point =new GeoPoint((int)(39.915* 1E6),(int)(116.404* 1E6));  
        //用给定的经纬度构造一个GeoPoint，单位是微度 (度 * 1E6)  
        mMapController.setCenter(point);//设置地图中心点  
        mMapController.setZoom(12);//设置地图zoom级别        
    }
    
    @Override
    protected void onPause() {
    	/**
    	 *  MapView的生命周期与Activity同步，当activity挂起时需调用MapView.onPause()
    	 */
        mMapView.onPause();
        super.onPause();
    }
    
    @Override
    protected void onResume() {
    	/**
    	 *  MapView的生命周期与Activity同步，当activity恢复时需调用MapView.onResume()
    	 */
        mMapView.onResume();
        super.onResume();
    }
    
    @Override
    protected void onDestroy() {
    	/**
    	 *  MapView的生命周期与Activity同步，当activity销毁时需调用MapView.destroy()
    	 */
        mMapView.destroy();
        super.onDestroy();
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
    	super.onSaveInstanceState(outState);
    	mMapView.onSaveInstanceState(outState);
    	
    }
    
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	super.onRestoreInstanceState(savedInstanceState);
    	mMapView.onRestoreInstanceState(savedInstanceState);
    }
    
    /*
     * 返回当前位置的string
     * 
     */
    public   String getLocationString(){
    	
    	
    	return "西二旗大厦";
    }
    
    public  void addPoint(){
    	
//        GeoPoint p2 = new GeoPoint ((int)(mLat2*1E6),(int)(mLon2*1E6));
//        OverlayItem item2 = new OverlayItem(p2,"覆盖物2","");
//        item2.setMarker(getResources().getDrawable(R.drawable.icon_markb));
    }
    
}
