package com.mycompany.model.magus;

import com.mycompany.model.AbstractItem;

public class MagusItem extends AbstractItem {
	
	int durability = 100;
	boolean isBrokeable = true;
	
	public MagusItem(String itemName) {
		super(itemName);
	}
	
	public MagusItem(String itemName, boolean isBrokeable) {
		super(itemName);
		this.isBrokeable = isBrokeable;
	}
}
