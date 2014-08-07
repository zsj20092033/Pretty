package com.clock.pretty.activity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.text.TextUtils;

public class PageGridPage {
	
	private static final String TAG = "PageGridPage";
	
	public static List<PageGridItem> allItems = new ArrayList<PageGridItem>();
	public static List<PageGridItem> subedItems = new ArrayList<PageGridItem>(); 
	private List<PageGridItem> items = new ArrayList<PageGridItem>();
	
	public static void configToList(Context context) {
		allItems.clear();
		subedItems.clear();
		String str = readDataFromAssets(context);
		if (TextUtils.isEmpty(str)) {
			return;
		}
		try {
			JSONArray jsonArray = new JSONObject(str).getJSONArray("classes");
			if (jsonArray == null || jsonArray.length() <= 0) {
				return;
			}
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject object = jsonArray.getJSONObject(i);
				PageGridItem item = new PageGridItem(i, object.getString("show_name"));
				item.setCouldDel(object.optInt("could_del"));
				item.setCouldMove(object.optInt("could_move"));
				item.setItemIndex(object.optInt("index"));
				item.setIsSubscribed(object.optInt("sub_flag"));
				allItems.add(item);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	private static String readDataFromAssets(Context context) {
		try {
			InputStream is = context.getResources().getAssets().open("page_config.txt");
			byte[] b = new byte[is.available()];
			is.read(b);
			is.close();
			String str = new String(b, "utf-8");
			return str;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public List<PageGridItem> getItems() {
		return items;
	}

	public void setItems(List<PageGridItem> items) {
		this.items = items;
	}
	
	public void addItem(PageGridItem item) {
		items.add(item);
	}
	
	public void swapItems(int itemA, int itemB) {
		Collections.swap(items, itemA, itemB);
	}
	
	public PageGridItem removeItem(int index) {
		PageGridItem item = items.get(index);
		items.remove(index);
		return item;
	}
	
	public void deleteItem(int index) {
		items.remove(index);
	}
}
