package com.exercism.exercise;

import java.util.Random;

public class CaptainsLog
{
	private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

	private Random random;

	CaptainsLog(Random random)
	{
		this.random = random;
	}

	char randomPlanetClass()
	{
		int randIndex = random.nextInt(PLANET_CLASSES.length);
		return PLANET_CLASSES[randIndex];
	}

	String randomShipRegistryNumber()
	{
		int randShipRegistry = 1000 + random.nextInt(9000);
		return "NCC-" + randShipRegistry;
	}

	double randomStardate()
	{
		return 41000.0 + 1000.0 * random.nextDouble();
	}

	public static void main(String[] args)
	{
		var captainsLog = new CaptainsLog(new Random());
		System.out.println(captainsLog.randomPlanetClass());
	}
}
