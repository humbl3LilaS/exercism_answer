package com.exercism.exercise;

public class Leap
{
	public boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		}
		return year % 100 != 0 || year % 400 == 0;
	}
}
