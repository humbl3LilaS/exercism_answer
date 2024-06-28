package com.exercism.exercise;

import java.math.BigInteger;

public class Grains
{
	public BigInteger grainsOnSquare(final int square)
	{
		if (square < 0 || square > 64)
		{
			throw new IllegalArgumentException("square must be between 1 and 64");
		}
		return BigInteger.valueOf(2).pow(square - 1);
	}

	public BigInteger grainsOnBoard()
	{
		var total = BigInteger.ZERO;
		for (int i = 1; i <= 64; i++)
		{
			total = total.add(grainsOnSquare(i));
		}
		return total;
	}

}
