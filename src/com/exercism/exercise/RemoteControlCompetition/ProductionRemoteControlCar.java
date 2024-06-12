package com.exercism.exercise.RemoteControlCompetition;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>
{
	private final int speed = 10;

	private int distanceTravelled = 0;

	private int numberOfVictories = 0;

	@Override
	public void drive()
	{
		distanceTravelled += speed;
	}

	@Override
	public int getDistanceTravelled()
	{
		return distanceTravelled;
	}

	public int getNumberOfVictories()
	{
		return numberOfVictories;
	}

	public void setNumberOfVictories(int numberOfVictories)
	{
		this.numberOfVictories = numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar o)
	{
		if (numberOfVictories == o.numberOfVictories) return 0;
		return numberOfVictories > o.numberOfVictories ? -1 : 1;
	}
}
