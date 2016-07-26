package com.mycompany.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.model.magus.MagusCharacterStatistics;

public class MagusCharacterStaticticsTest {
	
	@Test
	public void testGenerateCharacterStatistics() {
		MagusCharacterStatistics mcs = new MagusCharacterStatistics();
		
		System.out.println("The testGenerateCharacterStatistics generated a character with stats below:");
		System.out.println("Agility = " + mcs.getAgility());
		System.out.println("HealthPoints = " + mcs.getHealthPoints());
		System.out.println("Luck = " + mcs.getLuck());
		System.out.println("Mana = " + mcs.getMana());
		System.out.println("Strength = " + mcs.getStrength());
		
		assertTrue(mcs.getAgility() > 0);
		assertTrue(mcs.getHealthPoints() > 0);
		assertTrue(mcs.getLuck() > 0);
		assertTrue(mcs.getMana() > 0);
		assertTrue(mcs.getStrength() > 0);
	}
}
