package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	List<AbstractItem> inventoryList;

	public Inventory() {
		inventoryList = new ArrayList<>();
	}
	
	public void addItem(AbstractItem item){
		inventoryList.add(item);
	}
	
	public boolean removeItem(AbstractItem item){
		return inventoryList.remove(item);
	}
	
	public String toString() {
		
		if (inventoryList.isEmpty()) {
			return "";
		}
		
		boolean isFirst = true;
		StringBuilder itemNames = new StringBuilder();
		
		for (AbstractItem item : inventoryList){	
			if (isFirst) {
				itemNames.append(item.getObjectName());
				isFirst = false;
			} else if (!isFirst){
				itemNames.append(", ");
				itemNames.append(item.getObjectName());				
			}
		}
		return itemNames.toString();
	}
	
}
