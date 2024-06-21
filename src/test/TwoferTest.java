package test;

import com.exercism.exercise.Twofer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoferTest
{
	private Twofer twofer;

	@BeforeEach
	public void setup()
	{
		twofer = new Twofer();
	}

	@Test
	public void noNameGiven()
	{
		assertEquals("One for you, one for me", twofer.twofer(null));
	}
	@Test
	public void aNameGiven() {
		assertEquals("One for Edelweiss, one for me", twofer.twofer("Edelweiss"));
		assertEquals("One for Kyawt, one for me", twofer.twofer("Kyawt"));
	}
}
