package com.exercism.exercise;

public class ElonsToyCar
{
	private final int speed = 20;

	private int distanceTravelled = 0;

	private int battery = 100;

	public static ElonsToyCar buy()
	{
		return new ElonsToyCar();
	}

	public String distanceDisplay()
	{
		return String.format("Driven %s meters", distanceTravelled);
	}

	public String batteryDisplay()
	{
		return battery != 0 ? String.format("Battery at %s", battery) + "%" : "Battery empty";
	}

	public void drive()
	{
		if (battery != 0)
		{
			distanceTravelled += speed;
			battery -= 1;
		}
	}

	public static void main(String[] args)
	{

	}
}
