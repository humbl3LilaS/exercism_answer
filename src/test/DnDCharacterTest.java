package test;

import com.exercism.exercise.DnDCharacter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DnDCharacterTest
{
	private DnDCharacter character = new DnDCharacter();

	@Test
	void testDiceValueBetween1and6() {
		assertTrue(character.rollDice().stream().allMatch(d -> d > 0 && d < 7));
	}

	@Test
	void testAbilityModifierForScore3IsNegative4() {
		assertEquals(-4, character.modifier(3));
	}
	@Test
	void testAbilityModifierForScore14Is2() {
		assertEquals(2, character.modifier(14));
	}

	@Test
	void testAbility() {
		assertEquals(9, character.ability(List.of(4, 3, 2, 1)));
	}
}
