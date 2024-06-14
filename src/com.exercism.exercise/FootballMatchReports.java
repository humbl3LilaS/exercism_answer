package com.exercism.exercise;

public class FootballMatchReports
{
	public static String onField(int shirtNum)
	{
		return switch (shirtNum)
		{
			case 1 -> "goalie";
			case 2 -> "left back";
			case 5 -> "right back";
			case 9 -> "left wing";
			case 10 -> "striker";
			case 11 -> "right wing";
			default ->
			{
				if (shirtNum > 2 && shirtNum < 5) yield "center back";
				if (shirtNum > 5 && shirtNum < 9) yield "midfielder";
				throw new IllegalArgumentException();
			}
		};
	}
}
