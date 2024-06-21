package test;

import com.exercism.exercise.ArmstrongNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArmstrongNumbersTest
{
	@Test
	void testArmstrongNumber() {
		var armstrongNumber =new ArmstrongNumbers();
		assertEquals(true, armstrongNumber.isArmstrongNumber(9));
		assertEquals(false, armstrongNumber.isArmstrongNumber(10));
		assertEquals(true, armstrongNumber.isArmstrongNumber(153));
	}
}
