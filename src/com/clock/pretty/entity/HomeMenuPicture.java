package com.clock.pretty.entity;

import java.util.HashMap;

import com.clock.pretty.R;

public final class HomeMenuPicture {
	public static final HashMap<String, Integer> menu_pic = new ImageConstants();
	
	static class ImageConstants extends HashMap<String, Integer> {
		
		private static final long serialVersionUID = 2916158129788831277L;

		ImageConstants() {
			put("收藏", Integer.valueOf(R.drawable.home_grids_favourite));
		    put("搜索", Integer.valueOf(R.drawable.home_grids_search));
		    put("资讯", Integer.valueOf(R.drawable.home_grids_information));
		    put("美女", Integer.valueOf(R.drawable.home_grids_beauty));
		    put("明星", Integer.valueOf(R.drawable.home_grids_star));
		    put("壁纸", Integer.valueOf(R.drawable.home_grids_wallpaper));
		    put("搞笑", Integer.valueOf(R.drawable.home_grids_funny));
		    put("摄影", Integer.valueOf(R.drawable.home_grids_photography));
		    put("动漫", Integer.valueOf(R.drawable.home_grids_anime));
		    put("宠物", Integer.valueOf(R.drawable.home_grids_pet));
		    put("设计", Integer.valueOf(R.drawable.home_grids_design));
		    put("汽车", Integer.valueOf(R.drawable.home_grids_car));
		    put("旅游", Integer.valueOf(R.drawable.home_grids_travel));
		    put("家居", Integer.valueOf(R.drawable.home_grids_home));
		    put("美食", Integer.valueOf(R.drawable.home_grids_gourmet));
		    put("DIY", Integer.valueOf(R.drawable.home_grids_diy));
		    put("服饰", Integer.valueOf(R.drawable.home_grids_apparel));
		    put("美妆", Integer.valueOf(R.drawable.home_grids_makeup));
		    put("亲子", Integer.valueOf(R.drawable.home_grids_family));
		    put("人文", Integer.valueOf(R.drawable.home_grids_humanities));
		    put("军事", Integer.valueOf(R.drawable.home_grids_military));
		    put("体育", Integer.valueOf(R.drawable.home_grids_sports));
		    put("数码", Integer.valueOf(R.drawable.home_grids_digital));
		    put("信息图", Integer.valueOf(R.drawable.home_grids_information_figure));
		    put("素材", Integer.valueOf(R.drawable.home_grids_material));
		    put("动物", Integer.valueOf(R.drawable.home_grids_animal));
		    put("植物", Integer.valueOf(R.drawable.home_grids_plant));
		}
	}
}
