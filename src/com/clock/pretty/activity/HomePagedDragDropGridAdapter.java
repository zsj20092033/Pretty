package com.clock.pretty.activity;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ca.laplanete.mobile.pageddragdropgrid.PagedDragDropGridAdapter;


public final class HomePagedDragDropGridAdapter implements PagedDragDropGridAdapter {
	
	public static List<PageGridPage> page_list;
	public static List<PageGridItem> item_list;
	private static HomePagedDragDropGridAdapter adapter;
	private Context context;
	private LayoutInflater inflater;
	
	private HomePagedDragDropGridAdapter(Context context) {
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		init();
	}
	
	public static HomePagedDragDropGridAdapter getInstance(Context context) {
		if (adapter == null) {
			adapter = new HomePagedDragDropGridAdapter(context);
		}
		return adapter;
	}
	
	private static void resetGridPage() {
		page_list.clear();
		init();
	}
	
	private static void init() {
		List list;
		int i;
	}

	@Override
	public int pageCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int itemCountInPage(int page) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View view(int page, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int columnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printLayout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swapItems(int pageIndex, int itemIndexA, int itemIndexB) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveItemToPreviousPage(int pageIndex, int itemIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveItemToNextPage(int pageIndex, int itemIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(int pageIndex, int itemIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteDropZoneLocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean showRemoveDropZone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPageWidth(int page) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItemAt(int page, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean disableZoomAnimationsOnChangePage() {
		// TODO Auto-generated method stub
		return false;
	}

}
