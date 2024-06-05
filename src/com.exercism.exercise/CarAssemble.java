package com.exercism.exercise;

public class CarAssemble
{
	private int productionRatePerHour = 221;

	public double productionRatePerHour(int speed)
	{
		if (speed < 5)
		{
			return productionRatePerHour * speed;
		} else if (speed > 4 && speed < 9)
		{
			return productionRatePerHour * speed * 0.9;
		} else if (speed == 9)
		{
			return productionRatePerHour * speed * 0.8;
		} else
		{
			return productionRatePerHour * speed * 0.77;
		}
	}

	public int workingItemsPerMinute(int speed)
	{
		return (int) productionRatePerHour(speed) / 60;
	}


	public static void main(String[] args)
	{
		System.out.println(new CarAssemble().productionRatePerHour(10));
	}
}
