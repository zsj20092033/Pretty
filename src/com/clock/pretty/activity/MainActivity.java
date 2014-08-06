package com.clock.pretty.activity;

import com.clock.pretty.R;
import com.clock.pretty.application.MyApplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private static final String TAG = "MainActivity";
	
	private ImageView run_bg;
	private Animation ani_left,ani_right;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate-----------------------------");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		run_bg = (ImageView) findViewById(R.id.run_bg);
		
		initAnimation();		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}

	final AnimationListener listener = new AnimationListener() {
		
		@Override
		public void onAnimationStart(Animation animation) {			
		}
		
		@Override
		public void onAnimationRepeat(Animation animation) {			
		}
		
		@Override
		public void onAnimationEnd(Animation animation) {
			if (animation == ani_left) {
				run_bg.startAnimation(ani_right);
			}
			if (animation == ani_right) {
				run_bg.startAnimation(ani_left);
			}
		}
	};
	
	private void initAnimation() {
		ani_left = new TranslateAnimation((MyApplication.SCREEN_WIDTH - run_bg.getLayoutParams().width)/2,0,0,0);
		ani_right = new TranslateAnimation(0,(MyApplication.SCREEN_WIDTH - run_bg.getLayoutParams().width)/2,0,0);
		ani_left.setInterpolator(new AccelerateDecelerateInterpolator());
		ani_left.setDuration(10000);
		ani_left.setFillAfter(true);
		ani_left.setFillEnabled(true);
		ani_left.setAnimationListener(listener);
		ani_right.setInterpolator(new AccelerateDecelerateInterpolator());
		ani_right.setDuration(10000);
		ani_right.setFillAfter(true);
		ani_right.setFillEnabled(true);
		ani_right.setAnimationListener(listener);
		run_bg.startAnimation(ani_left);
	}
}
