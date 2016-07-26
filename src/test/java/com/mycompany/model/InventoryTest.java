package com.mycompany.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mycompany.model.magus.MagusItem;

public class InventoryTest {
	
	@Test
	public void testInventory() {
		
		Inventory inventory = new Inventory();
		
		MagusItem sword = new MagusItem("Sword of the thousand truth");
		
		inventory.addItem(sword);
		
		assertEquals("Sword of the thousand truth", inventory.toString());
		
		MagusItem shield = new MagusItem("Shield of the lusty boar");
		
		inventory.addItem(shield);
		
		assertEquals("Sword of the thousand truth, Shield of the lusty boar", inventory.toString());
		
		inventory.removeItem(sword);
		
		assertEquals("Shield of the lusty boar", inventory.toString());
		
		inventory.removeItem(shield);
		
		assertEquals("", inventory.toString());
	}
}
