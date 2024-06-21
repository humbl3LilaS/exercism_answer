package com.exercism.exercise;

public class ArmstrongNumbers
{
	public boolean isArmstrongNumber(int number)
	{
		String[] strArr = String.valueOf(number).split("");
		int total = 0;
		for (String s : strArr)
		{
			total += (int) Math.pow(Integer.parseInt(s), strArr.length);
		}
		return number == total;
	}
}
