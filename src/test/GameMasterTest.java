package test;

import com.exercism.exercise.WizardAndWarriors.Destination;
import com.exercism.exercise.WizardAndWarriors.GameMaster;
import com.exercism.exercise.WizardAndWarriors.TravelMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.exercism.exercise.WizardAndWarriors.Character;

public class GameMasterTest
{

	@Test
	void testCharacterDescription() {
		Character character = new Character();
		character.setCharacterClass("Wizard");
		character.setLevel(4);
		character.setHitPoints(28);
		var gm = new GameMaster();
		Assertions.assertEquals("You're a level 4 Wizard with 28 hit points.",gm.describe(character));
	}

	@Test
	void testDestinationDescription() {
		Destination destination = new Destination();
		destination.setName("Muros");
		destination.setInhabitants(732);
		var gm = new GameMaster();
		Assertions.assertEquals("You've arrived at Muros, which has 732 inhabitants.",gm.describe(destination));

	}

	@Test
	void testTravelMethodDescription() {
		var gm = new GameMaster();
		Assertions.assertEquals("You're traveling to your destination on horseback.",
								gm.describe(TravelMethod.HORSEBACK));
		Assertions.assertEquals("You're traveling to your destination by walking.",
								gm.describe(TravelMethod.WALKING));
	}
}
