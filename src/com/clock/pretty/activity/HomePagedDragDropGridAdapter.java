package com.clock.pretty.activity;

import java.util.ArrayList;
import java.util.Collections;
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
	
	private static List<PageGridItem> getItemsFromPageIndex(int pageIndex) {
		if (pageIndex < page_list.size()) {
			return page_list.get(pageIndex).getItems();
		}
		return Collections.emptyList();
	}
	
	private static PageGridPage getPageFromIndex(int pageIndex) {
		if (pageIndex < page_list.size()) {
			return page_list.get(pageIndex);
		}
		return null;
	}
	
	private static void init() {
		List<PageGridItem> list;
		int i;
		if (PageGridPage.subedItems.size() == 0) {
			list = PageGridPage.getSubscribedItems();
		} else {
			list = PageGridPage.mergeList();
		}
		i = list.size();
		for (int j = 0; j < i / 6; j++) {
			PageGridPage page = new PageGridPage();
			List<PageGridItem> items = new ArrayList<PageGridItem>();
			for (int k = 0; k < 6; k++) {
				PageGridItem item = list.get(6*j+k);
				items.add(item);
			}
			page.setItems(items);
			page_list.add(page);
		}
		if (i % 6 != 0) {
			PageGridPage page = new PageGridPage();
			List<PageGridItem> items = new ArrayList<PageGridItem>();
			for (int j = 0; j < i % 6; j++) {
				PageGridItem item = list.get(i / 6 * 6 + j);
				items.add(item);
			}
			page.setItems(items);
			page_list.add(page);
		}
	}

	@Override
	public int pageCount() {
		return page_list.size();
	}

	@Override
	public int itemCountInPage(int page) {
		return page_list.get(page).getItems().size();
	}

	@Override
	public View view(int page, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rowCount() {
		return AUTOMATIC;
	}

	@Override
	public int columnCount() {
		return AUTOMATIC;
	}

	@Override
	public void printLayout() {
		
	}

	@Override
	public void swapItems(int pageIndex, int itemIndexA, int itemIndexB) {
		PageGridPage page = page_list.get(pageIndex);
		if (page != null) {
			page.swapItems(itemIndexA, itemIndexB);
		}
		
	}

	@Override
	public void moveItemToPreviousPage(int pageIndex, int itemIndex) {
		int i = pageIndex - 1;
		PageGridPage page1;
		PageGridPage page2;
		if (i >= 0) {
			page1 = page_list.get(i);
			page2 = page_list.get(pageIndex);
			if ((page1 != null) && (page2 != null));
		} else {
			return;
		}
		PageGridItem item1 = page1.removeItem(page1.sizeOfItems() - 1);
		PageGridItem item2 = page2.removeItem(itemIndex);
		page1.addItem(item2);
		page2.addItem(item1);
	}

	@Override
	public void moveItemToNextPage(int pageIndex, int itemIndex) {
		int i = pageIndex + 1;
		PageGridPage page1;
		PageGridPage page2;
		if (i < pageCount()) {
			page1 = page_list.get(pageIndex);
			page2 = page_list.get(i);
			if (page1 != null && page2 != null);
		} else {
			return;
		}
		PageGridItem item1 = page1.removeItem(itemIndex);
		PageGridItem item2 = page2.removeItem(0);
		page1.addItem(item2);
		page2.addItem(item1);		
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
