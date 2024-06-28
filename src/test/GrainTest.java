package test;

import com.exercism.exercise.Grains;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrainTest
{
	private final Grains grain = new Grains();

	@Test
	void testGrainInFirstSquare()
	{
		assertEquals(new BigInteger("1"), grain.grainsOnSquare(1));
	}

	@Test
	void testGrainInSecondSquare()
	{
		assertEquals(new BigInteger("2"), grain.grainsOnSquare(2));
	}

	@Test
	void testGrainIn4thSquare()
	{
		assertEquals(new BigInteger("8"), grain.grainsOnSquare(4));
	}

	@Test
	void testGrainIn16thSquare()
	{
		assertEquals(new BigInteger("32768"), grain.grainsOnSquare(16));
	}

	@Test
	void testTotalGrainOnBoard()
	{
		assertEquals(new BigInteger("18446744073709551615"), grain.grainsOnBoard());
	}
}
