package test;

import com.exercism.exercise.ReverseString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest
{
	@Test
	void testReverse() {
		var reverse = new ReverseString();
		assertEquals("desserts",reverse.reverse("stressed"));
		assertEquals("strops",reverse.reverse("sports"));
		assertEquals("racecar", reverse.reverse("racecar"));
	}
}
