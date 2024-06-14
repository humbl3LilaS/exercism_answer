package test;

import com.exercism.exercise.CalculatorConundrum.CalculatorConundrum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorConundrumTest
{
	@Test
	void testCalculate()
	{
		var calculator = new CalculatorConundrum();
		Assertions.assertEquals("16 + 51 = 67", calculator.calculate(16, 51, "+"));
		Assertions.assertEquals("32 * 6 = 192", calculator.calculate(32, 6, "*"));
		Assertions.assertEquals("512 / 4 = 128", calculator.calculate(512, 4, "/"));
	}
}
