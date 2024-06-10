package com.exercism.exercise;

public class NeedForSpeed
{
	private int speed;
	private int batteryDrain;

	private int battery = 100;
	private int distanceDriven = 0;

	public NeedForSpeed(int speed, int batteryDrain)
	{
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}

	public boolean batteryDrained()
	{
		return battery == 0;
	}

	public int distanceDriven()
	{
		return distanceDriven;
	}

	public void drive()
	{
		if (battery != 0)
		{
			distanceDriven += speed;
			battery -= batteryDrain;
		}
	}

	public static NeedForSpeed nitro()
	{
		return new NeedForSpeed(50, 4);
	}
}

class RaceTrack
{
	private int distance;

	RaceTrack(int distance)
	{
		this.distance = distance;
	}

	public boolean tryFinishTrack(NeedForSpeed car)
	{
		while (!car.batteryDrained())
		{
			car.drive();
			if (car.distanceDriven() >= distance)
			{
				return true;
			}
		}
		return false;
	}
}
