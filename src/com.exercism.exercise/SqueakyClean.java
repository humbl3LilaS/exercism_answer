package com.exercism.exercise;

import java.util.Arrays;
import java.util.List;

public class SqueakyClean
{

	static String clean(String identifier)
	{
		StringBuilder sB = new StringBuilder(identifier);
		Character[] leetSpeak = {'4', '3', '0', '1', '7'};
		int[] indexToRemove = new int[sB.length()];
		Arrays.fill(indexToRemove, -1);
		for (int i = 0; i < sB.length(); i++)
		{
			if (sB.charAt(i) == ' ')
			{
				sB.setCharAt(i, '_');
			} else if (sB.charAt(i) == '-')
			{

				sB.setCharAt(i + 1, Character.toUpperCase(sB.charAt(i + 1)));
				indexToRemove[i] = i;
			}
			if (List.of(leetSpeak).contains(sB.charAt(i)))
			{
				switch (sB.charAt(i))
				{
					case '4':
						sB.setCharAt(i, 'a');
						break;
					case '3':
						sB.setCharAt(i, 'e');
						break;
					case '7':
						sB.setCharAt(i, 't');
						break;
					case '1':
						sB.setCharAt(i, 'l');
						break;
					case '0':
						sB.setCharAt(i, 'o');
						break;
				}
			}
			if ((sB.codePointAt(i) < 48) || (sB.codePointAt(i) > 57 && sB.codePointAt(
					i) < 65) || (sB.codePointAt(i) > 90 && sB.codePointAt(
					i) < 94) || (sB.codePointAt(i) > 95 && sB.codePointAt(
					i) < 97) || sB.codePointAt(i) > 122)
			{
				indexToRemove[i] = i;
			}

		}


		int deleteCount = 0;
		for (int i = 0; i < indexToRemove.length; i++)
		{
			if (indexToRemove[i] >= 0)
			{
				sB.deleteCharAt(i - deleteCount++);
			}
		}


		return sB.toString();
	}

	public static void main(String[] args)
	{
//		System.out.println(clean("my  Id"));
//		System.out.println(clean("a-bc"));
//		System.out.println(clean("H3ll0 W0rld"));
		System.out.println(clean("__myid"));
//		System.out.println(Character.codePointAt("#", 0));
	}
}
