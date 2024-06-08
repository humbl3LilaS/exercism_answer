package com.exercism.exercise;

import java.util.Arrays;

class BirdWatcher
{
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay)
	{
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek()
	{
		int[] lastWeekVisit = {0, 2, 5, 3, 7, 8, 4};

		return lastWeekVisit;
	}

	public int getToday()
	{
		return birdsPerDay[birdsPerDay.length - 1];
	}

	public void incrementTodaysCount()
	{
		int todayCount = birdsPerDay[birdsPerDay.length - 1];
		birdsPerDay[birdsPerDay.length - 1] = todayCount + 1;
	}

	public boolean hasDayWithoutBirds()
	{
		int dayWithoutBirds = (int) Arrays.stream(birdsPerDay)
										  .filter(x -> x == 0).count();
		return dayWithoutBirds > 0;
	}

	public int getCountForFirstDays(int numberOfDays)
	{
		int total = 0;
		int itr = Math.min(numberOfDays, 7);
		for (int i = 0; i < itr; i++)
		{
			total += birdsPerDay[i];
		}
		return total;
	}

	public int getBusyDays()
	{
		return (int) Arrays.stream(birdsPerDay).filter(x -> x >= 5).count();
	}
}
