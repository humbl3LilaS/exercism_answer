package com.exercism.exercise;

import java.util.*;

public class DnDCharacter
{
	private Map<String, Integer> characterAttributes = new HashMap<>();

	private final String[] ATTRIBUTES = {"strength", "dexterity", "constitution", "intelligence",
			"wisdom", "charisma"};

	public DnDCharacter()
	{
		for (String attribute : ATTRIBUTES)
		{
			characterAttributes.put(attribute, ability(rollDice()));
		}
	}

	public int ability(List<Integer> scores)
	{
		return scores.stream().sorted((a, b) -> b - a).limit(3).reduce(0, Math::addExact);
	}

	public List<Integer> rollDice()
	{
		List<Integer> rolledValueForAbilityDefining = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 4; i++)
		{
			int randValue = rand.nextInt(1, 7);
			rolledValueForAbilityDefining.add(randValue);
		}
		return rolledValueForAbilityDefining;
	}

	public int modifier(int input)
	{
		return (int) Math.floor((double) (input - 10) / 2);
	}

	int getStrength()
	{
		return characterAttributes.get("strength");
	}

	int getDexterity()
	{
		return characterAttributes.get("dexterity");
	}

	int getConstitution()
	{
		return characterAttributes.get("constitution");
	}

	int getIntelligence()
	{
		return characterAttributes.get("intelligence");
	}

	int getWisdom()
	{
		return characterAttributes.get("wisdom");
	}

	int getCharisma()
	{
		return characterAttributes.get("charisma");
	}

	int getHitpoints()
	{
		return 10 + modifier(getConstitution());
	}
}
