package test;

import com.exercism.exercise.RemoteControlCompetition.ExperimentalRemoteControlCar;
import com.exercism.exercise.RemoteControlCompetition.ProductionRemoteControlCar;
import com.exercism.exercise.RemoteControlCompetition.TestTrack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SpeedControlCarTest
{
	@Test
	void testDrive()
	{
		var expCar = new ExperimentalRemoteControlCar();
		var productionCar = new ProductionRemoteControlCar();
		Assertions.assertEquals(0, expCar.getDistanceTravelled());
		Assertions.assertEquals(0, productionCar.getDistanceTravelled());
		expCar.drive();
		productionCar.drive();
		Assertions.assertEquals(20, expCar.getDistanceTravelled());
		Assertions.assertEquals(10, productionCar.getDistanceTravelled());
	}

	@Test
	void testDriveViaTract()
	{
		var expCar = new ExperimentalRemoteControlCar();
		var productionCar = new ProductionRemoteControlCar();
		TestTrack.race(expCar);
		TestTrack.race(productionCar);
		Assertions.assertEquals(20, expCar.getDistanceTravelled());
		Assertions.assertEquals(10, productionCar.getDistanceTravelled());
	}

	@Test
	void testProductionCarSorting()
	{
		var prod1 = new ProductionRemoteControlCar();
		var prod2 = new ProductionRemoteControlCar();
		prod1.setNumberOfVictories(2);
		prod2.setNumberOfVictories(3);
		List<ProductionRemoteControlCar> unsorted = List.of(prod1, prod2);
		List<ProductionRemoteControlCar> sorted = TestTrack.getRankedCars(unsorted);
		Assertions.assertEquals(prod2.getNumberOfVictories(), sorted.get(0).getNumberOfVictories());
		Assertions.assertEquals(prod1.getNumberOfVictories(), sorted.get(1).getNumberOfVictories());

	}
}
