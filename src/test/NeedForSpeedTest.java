package test;

import com.exercism.exercise.NeedForSpeed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NeedForSpeedTest
{

	@Test
	void testDriveAndDistanceDriven()
	{
		NeedForSpeed car = new NeedForSpeed(5, 2);
		car.drive();
		Assertions.assertEquals(5, car.distanceDriven());
		car.drive();
		Assertions.assertEquals(10, car.distanceDriven());
	}

	@Test
	void testBatteryDrained()
	{
		NeedForSpeed car = new NeedForSpeed(5, 50);
		Assertions.assertEquals(false, car.batteryDrained());
		car.drive();
		car.drive();
		Assertions.assertEquals(true, car.batteryDrained());
	}

	@Test
	void nitroTest() {
		NeedForSpeed nitroCar = NeedForSpeed.nitro();
		nitroCar.drive();
		Assertions.assertEquals(50, nitroCar.distanceDriven());
		Assertions.assertEquals(false, nitroCar.batteryDrained());
	}


}
