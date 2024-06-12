package com.exercism.exercise.RemoteControlCompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar
{

	private final int speed = 20;

	private int distanceTravelled = 0;

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
}
