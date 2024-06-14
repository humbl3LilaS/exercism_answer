package test;

import com.exercism.exercise.CalculatorConundrum.CalculatorConundrum;
import com.exercism.exercise.CalculatorConundrum.IllegalOperationException;
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

	@Test
	void testExceptions()
	{
		var calculator = new CalculatorConundrum();
		Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(13, 12,
																						   null));
		Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(13, 12,
																						   ""));
		Assertions.assertThrows(IllegalOperationException.class, () -> calculator.calculate(13, 12,
																							"-"));
	}

	@Test
	void testErrorMessage()
	{
		var calculator = new CalculatorConundrum();
		Exception exp1 = Assertions.assertThrows(IllegalArgumentException.class,
												 () -> calculator.calculate(13, 12,
																			null));
		Assertions.assertTrue(exp1.getMessage().contains("Operation cannot be null"));
		Exception exp2 = Assertions.assertThrows(IllegalArgumentException.class,
												 () -> calculator.calculate(13, 12,
																			""));
		Assertions.assertTrue(exp2.getMessage().contains("Operation cannot be empty"));
		Exception exp3 = Assertions.assertThrows(IllegalOperationException.class,
												 () -> calculator.calculate(13, 12,
																			"-"));
		Assertions.assertTrue(exp3.getMessage().contains("Operation '-' does not exist"));


	}
}
