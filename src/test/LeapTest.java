package test;

import com.exercism.exercise.Leap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapTest
{
	@Test
	void testIsLeap()
	{
		var leap = new Leap();
		assertEquals(true, leap.isLeapYear(2000));
		assertEquals(false, leap.isLeapYear(1900));
		assertEquals(false, leap.isLeapYear(1997));
	}

}
