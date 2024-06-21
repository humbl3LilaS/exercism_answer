package com.exercism.exercise;

public class ReverseString
{
	public String reverse(String input)
	{
		StringBuilder builder = new StringBuilder(input);
		return builder.reverse().toString();
	}
}
