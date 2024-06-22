package test;

import com.exercism.exercise.Darts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DartsTest
{
	Darts dart = new Darts();

	@Test
	void missedTarget()
	{
		assertEquals(0, dart.score(-9, 9));
	}

	@Test
	void onTheOuterCircle()
	{
		assertEquals(1, dart.score(0, 10));
	}

	@Test
	void onTheMiddleCircle()
	{
		assertEquals(5, dart.score(-5, 0));
	}

	@Test
	void onTheInnerCircle()
	{
		assertEquals(10, dart.score(0, -1));
	}
}
