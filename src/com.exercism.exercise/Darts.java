package com.exercism.exercise;


public class Darts
{
	private boolean isPointInsideCircle(double px, double py, int radius)
	{
		double distanceSquared = (px * px) + (py * py);
		double radiusSquared = radius * radius;
		return distanceSquared <= radiusSquared;
	}

	public int score(double xOfDart, double yOfDart)
	{
		if (isPointInsideCircle(xOfDart, yOfDart, 1))  {
			return  10;
		} else if(isPointInsideCircle(xOfDart, yOfDart, 5)) {
			return 5;
		} else if (isPointInsideCircle(xOfDart,yOfDart, 10)) {
			return 1;
		}
		return 0;
	}
}
