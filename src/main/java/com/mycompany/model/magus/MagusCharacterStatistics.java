package com.mycompany.model.magus;

import com.mycompany.model.AbstractCharacterStatistics;
import com.mycompany.model.Dice;

public class MagusCharacterStatistics extends AbstractCharacterStatistics{
	
	int healthPoints;
	int mana;
	int strength;
	int agility;
	int luck;
	
	public MagusCharacterStatistics() {
		Dice d6dice = new Dice(6);
		healthPoints = d6dice.roll(6);
		mana = d6dice.roll(6);
		strength = d6dice.roll(6);
		agility = d6dice.roll(6);
		luck = d6dice.roll(6);
	}
	
	MagusCharacterStatistics(int healthPoints, int mana, int strength, int agility, int luck) {
		this.healthPoints = healthPoints;
		this.mana = mana;
		this.strength = strength;
		this.agility = agility;
		this.luck = luck;
	}
	
	/*
	 * Setters and getters
	 */
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
}
