package com.clock.pretty.activity;

import ca.laplanete.mobile.pageddragdropgrid.PagedDragDropGrid;

import com.clock.pretty.R;
import com.clock.pretty.application.MyApplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener{
	
	private static final String TAG = "MainActivity";
	
	private ImageView run_bg;
	private Animation ani_left,ani_right;
	private PagedDragDropGrid grid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate-----------------------------");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		run_bg = (ImageView) findViewById(R.id.run_bg);
		grid = (PagedDragDropGrid) findViewById(R.id.main_grid);
		
		View v = LayoutInflater.from(this).inflate(R.layout.pagegrid_item, null);
		Log.i("Tag", v+"");
		View v1 = v.findViewById(R.id.parent);
		v1.setTag("layout");
		Log.i("TAG", v1.findViewWithTag("layout")+"");
		
		if ((PageGridPage.allItems != null) && (PageGridPage.allItems.size() == 0)) {
			PageGridPage.configToList(this);
		}
		HomePagedDragDropGridAdapter adapter = HomePagedDragDropGridAdapter.getInstance(this);
		grid.setAdapter(adapter);
		grid.setClickListener(this);
		grid.setFocusable(false);
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
		ani_left.setDuration(40000);
		ani_left.setFillAfter(true);
		ani_left.setFillEnabled(true);
		ani_left.setAnimationListener(listener);
		ani_right.setInterpolator(new AccelerateDecelerateInterpolator());
		ani_right.setDuration(40000);
		ani_right.setFillAfter(true);
		ani_right.setFillEnabled(true);
		ani_right.setAnimationListener(listener);
		run_bg.startAnimation(ani_left);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
