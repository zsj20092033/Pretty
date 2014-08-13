package com.clock.pretty.entity;

import java.util.HashMap;

import com.clock.pretty.R;

public final class HomeMenuPicture {
	public static final HashMap<String, Integer> menu_pic = new ImageConstants();
	
	static class ImageConstants extends HashMap<String, Integer> {
		
		private static final long serialVersionUID = 2916158129788831277L;

		ImageConstants() {
			put("�ղ�", Integer.valueOf(R.drawable.home_grids_favourite));
		    put("����", Integer.valueOf(R.drawable.home_grids_search));
		    put("��Ѷ", Integer.valueOf(R.drawable.home_grids_information));
		    put("��Ů", Integer.valueOf(R.drawable.home_grids_beauty));
		    put("����", Integer.valueOf(R.drawable.home_grids_star));
		    put("��ֽ", Integer.valueOf(R.drawable.home_grids_wallpaper));
		    put("��Ц", Integer.valueOf(R.drawable.home_grids_funny));
		    put("��Ӱ", Integer.valueOf(R.drawable.home_grids_photography));
		    put("����", Integer.valueOf(R.drawable.home_grids_anime));
		    put("����", Integer.valueOf(R.drawable.home_grids_pet));
		    put("���", Integer.valueOf(R.drawable.home_grids_design));
		    put("����", Integer.valueOf(R.drawable.home_grids_car));
		    put("����", Integer.valueOf(R.drawable.home_grids_travel));
		    put("�Ҿ�", Integer.valueOf(R.drawable.home_grids_home));
		    put("��ʳ", Integer.valueOf(R.drawable.home_grids_gourmet));
		    put("DIY", Integer.valueOf(R.drawable.home_grids_diy));
		    put("����", Integer.valueOf(R.drawable.home_grids_apparel));
		    put("��ױ", Integer.valueOf(R.drawable.home_grids_makeup));
		    put("����", Integer.valueOf(R.drawable.home_grids_family));
		    put("����", Integer.valueOf(R.drawable.home_grids_humanities));
		    put("����", Integer.valueOf(R.drawable.home_grids_military));
		    put("����", Integer.valueOf(R.drawable.home_grids_sports));
		    put("����", Integer.valueOf(R.drawable.home_grids_digital));
		    put("��Ϣͼ", Integer.valueOf(R.drawable.home_grids_information_figure));
		    put("�ز�", Integer.valueOf(R.drawable.home_grids_material));
		    put("����", Integer.valueOf(R.drawable.home_grids_animal));
		    put("ֲ��", Integer.valueOf(R.drawable.home_grids_plant));
		}
	}
}
