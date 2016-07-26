package com.mycompany.model;

public abstract class AbstractItem {
	
	String itemName;
	
	public AbstractItem(String itemName) {
		this.itemName = itemName;
	}

	public String getObjectName() {
		return itemName;
	}

	public void setObjectName(String objectName) {
		this.itemName = objectName;
	}
}
