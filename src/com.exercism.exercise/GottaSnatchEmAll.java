package com.exercism.exercise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GottaSnatchEmAll
{
	public static Set<String> newCollection(List<String> cards)
	{
		return new HashSet<String>(cards);
	}

	public static boolean addCard(String card, Set<String> collection)
	{
		return collection.add(card);
	}

	public static boolean canTrade(Set<String> myCollection, Set<String> theirCollection)
	{

		return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(
				myCollection);
	}

	public static Set<String> commonCards(List<Set<String>> collections)
	{
		var commonCards = collections.stream().reduce(
				(a, b) -> {
					var common = new HashSet<String>();
					for (String item : a)
					{
						if (b.contains(item)) common.add(item);
					}
					return common;
				}
		);
		return commonCards.orElseGet(Set::of);
	}

	static Set<String> allCards(List<Set<String>> collections)
	{
		var allCards = new HashSet<String>();
		collections.forEach(allCards::addAll);
		return allCards;
	}

	public static void main(String[] args)
	{
		var listOne = List.of(Set.of("Pokemon", "Zelda"), Set.of("Zelda"), Set.of("Zelda"));
		System.out.println(commonCards(listOne));
		List<Set<String>> collections = List.of(Set.of("Veevee"), Set.of("Bleakachu"),
												Set.of("Wigglycream"));
		System.out.println(commonCards(collections));
		var listTwo = List.of(Set.of("Pokemon", "Zelda"), Set.of("Zelda", "Last of us"), Set.of(
				"LoL"));
		System.out.println(allCards(listTwo));
	}
}
