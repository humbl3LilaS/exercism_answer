package com.exercism.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Fighter
{

	boolean isVulnerable()
	{
		return true;
	}

	int getDamagePoints(Fighter fighter)
	{
		return 1;
	}
}

class Warrior extends Fighter
{
	@Override
	boolean isVulnerable()
	{
		return false;
	}

	@Override
	int getDamagePoints(Fighter fighter)
	{
		return fighter.isVulnerable() ? 10 : 6;
	}

	@Override
	public String toString()
	{
		return "Fighter is a Warrior";
	}
}

class Wizard extends Fighter
{
	private boolean isPrecast = false;

	void prepareSpell()
	{
		isPrecast = true;
	}

	@Override
	boolean isVulnerable()
	{
		return !isPrecast;
	}

	@Override
	public String toString()
	{
		return "Fighter is a Wizard";
	}

	@Override
	int getDamagePoints(Fighter fighter)
	{
		return isPrecast ? 12 : 3;
	}
}


class FighterTest
{
	@Test
	void testDamagePointWarrior()
	{
		var warrior = new Warrior();
		Assertions.assertEquals(6, warrior.getDamagePoints(new Wizard()));
		Assertions.assertEquals(6, warrior.getDamagePoints(new Warrior()));
		var preCastedWizard = new Wizard();
		preCastedWizard.prepareSpell();

		Assertions.assertEquals(10, warrior.getDamagePoints(preCastedWizard));
	}

	@Test
	void testDamagePointWizard() {
		var wizard = new Wizard();
		var preCastedWizard = new Wizard();
		preCastedWizard.prepareSpell();
		Assertions.assertEquals(3, wizard.getDamagePoints(new Warrior()));
		Assertions.assertEquals(12, preCastedWizard.getDamagePoints(new Warrior()));
	}
}