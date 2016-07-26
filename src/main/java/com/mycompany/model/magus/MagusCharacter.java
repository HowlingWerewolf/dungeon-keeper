package com.mycompany.model.magus;

import com.mycompany.model.AbstractCharacter;

public class MagusCharacter extends AbstractCharacter {
	
	public MagusCharacter(String name, MagusCharacterStatistics stats) {
		this.characterName = name;
		this.characterStats = stats;
	}
}
