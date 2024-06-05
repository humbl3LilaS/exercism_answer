package com.exercism.exercise;

import java.util.Arrays;
import java.util.List;

public class SqueakyClean
{

	static String clean(String identifier)
	{
		return identifier.codePoints()
						 .map(new SqueakyCleanConverter())
						 .filter(i -> i > 0)
						 .collect(StringBuilder::new,
								  StringBuilder::appendCodePoint,
								  StringBuilder::append)
						 .toString();
	}

	public static void main(String[] args)
	{
//		System.out.println(clean("my  Id"));
//		System.out.println(clean("a-bc"));
		System.out.println(clean("H3ll0 W0rld"));
		System.out.println(clean("__myid"));
//		System.out.println(Character.codePointAt("#", 0));
	}
}
