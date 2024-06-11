package test;

import com.exercism.exercise.Secrets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecretsTest
{
	@Test
	void shiftBack()
	{

		Assertions.assertEquals(0b0010, Secrets.shiftBack(0b1001, 2));
	}

	@Test
	void setBits()
	{
		Assertions.assertEquals(0b0111, Secrets.setBits(0b0110, 0b0101));
		Assertions.assertEquals(0b1010, Secrets.setBits(0b1010, 0b0000));
		Assertions.assertEquals(0b1111, Secrets.setBits(0b1010, 0b1111));
	}

	@Test
	void flipBits()
	{
		Assertions.assertEquals(0b1001, Secrets.flipBits(0b1100, 0b0101));
		Assertions.assertEquals(0b1111, Secrets.flipBits(0b1010, 0b0101));
	}

	@Test
	void clearBits()
	{
		Assertions.assertEquals(0b0010, Secrets.clearBits(0b0110, 0b0101));
	}
}
