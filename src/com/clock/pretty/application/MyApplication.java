package com.clock.pretty.application;

import android.app.Application;
import android.util.DisplayMetrics;
import android.util.Log;

public class MyApplication extends Application {
	
	private static final String TAG = "MyApplication";
	
	public static float SCREEN_HEIGHT;
	public static float SCREEN_WIDTH;

	@Override
	public void onCreate() {
		super.onCreate();
		Log.i(TAG, "onCreate-------------------------");
		
		DisplayMetrics dm = getApplicationContext().getResources().getDisplayMetrics();
		SCREEN_HEIGHT = dm.heightPixels;
		SCREEN_WIDTH = dm.widthPixels;
	}
	
}
