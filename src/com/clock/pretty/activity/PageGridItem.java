package com.clock.pretty.activity;

public class PageGridItem {
	
	private int couldDel;
    private int couldMove;
    private long id;
    private int isSubscribed;
    private int itemIndex;
    private String name;
    
    public PageGridItem() {
    	
    }
    
    public PageGridItem(long id, String name) {
    	this.id = id;
    	this.name = name;
    }

	public int getCouldDel() {
		return couldDel;
	}

	public void setCouldDel(int couldDel) {
		this.couldDel = couldDel;
	}

	public int getCouldMove() {
		return couldMove;
	}

	public void setCouldMove(int couldMove) {
		this.couldMove = couldMove;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getIsSubscribed() {
		return isSubscribed;
	}

	public void setIsSubscribed(int isSubscribed) {
		this.isSubscribed = isSubscribed;
	}

	public int getItemIndex() {
		return itemIndex;
	}

	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
