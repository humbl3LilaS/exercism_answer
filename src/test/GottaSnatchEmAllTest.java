package test;

import com.exercism.exercise.GottaSnatchEmAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GottaSnatchEmAllTest
{

	@Test
	void testNewCollection()
	{
		assertEquals(new HashSet<String>(List.of("LoL")), GottaSnatchEmAll.newCollection(List.of(
				"LoL", "LoL", "LoL")));
		assertEquals(new HashSet<String>(List.of("LoL", "Dota")),
					 GottaSnatchEmAll.newCollection(List.of(
							 "LoL", "LoL", "Dota")));
		assertEquals(new HashSet<String>(List.of("LoL", "Dota")),
					 GottaSnatchEmAll.newCollection(List.of(
							 "LoL", "LoL", "Dota")));
	}

	@Test
	void testAddCard()
	{
		var cards = new HashSet<String>(List.of("Pokemon", "Zelda", "Last of us"));
		assertEquals(true, GottaSnatchEmAll.addCard("Last of us part two", cards));
		assertEquals(true, GottaSnatchEmAll.addCard("Assassin Creeds", cards));
		assertEquals(false, GottaSnatchEmAll.addCard("Zelda", cards));
	}

	@Test
	void testCanTrade()
	{
		var myCollection = new HashSet<String>(List.of("Pokemon", "Zelda"));
		var theirCollection = new HashSet<String>(List.of("Pokemon", "Zelda"));
		var theirCollectionTwo = new HashSet<String>(List.of("Pokemon", "Zelda", "Spiderman"));
		var tradableCollection = new HashSet<String>(List.of("Pokemon", "Last of us"));
		assertEquals(false, GottaSnatchEmAll.canTrade(myCollection, theirCollection));
		assertEquals(false, GottaSnatchEmAll.canTrade(myCollection, theirCollectionTwo));
		assertEquals(true, GottaSnatchEmAll.canTrade(myCollection,tradableCollection));
	}
}
