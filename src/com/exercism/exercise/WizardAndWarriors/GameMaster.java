package com.exercism.exercise.WizardAndWarriors;

public class GameMaster
{
	public String describe(Character character)
	{
		return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
	}

	public String describe(Destination destination)
	{
		return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() +
				" inhabitants.";
	}

	public String describe(TravelMethod method)
	{
		return switch (method)
		{
			case WALKING -> "You're traveling to your destination by walking.";
			case HORSEBACK -> "You're traveling to your destination on horseback.";
		};
	}

	public String describe(Character character, Destination destination, TravelMethod method)
	{
		String travelMethod = switch (method)
		{
			case WALKING -> "You're traveling to your destination by walking.";
			case HORSEBACK -> "You're traveling to your destination on horseback.";
		};
		return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
				" with " + character.getHitPoints() + " hit points. " + travelMethod + " You've " +
				"arrived at " + destination.getName() + ", which has " + destination.getInhabitants() +
				" inhabitants.";
	}

	public String describe(Character character, Destination destination) {
		return  "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
				" with " + character.getHitPoints() + " hit points. " + "You're traveling to your destination by walking." + " You've " +
				"arrived at " + destination.getName() + ", which has " + destination.getInhabitants() +
				" inhabitants.";
	}

}
