package com.exercism.exercise;

import java.util.ArrayList;
import java.util.List;

public class LanguageList
{
	private final List<String> languages = new ArrayList<>();

	private String capitalize(String str)
	{
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public boolean isEmpty()
	{
		return languages.isEmpty();
	}

	public void addLanguage(String language)
	{
		languages.add(capitalize(language));
	}

	public void removeLanguage(String language)
	{
		languages.remove(language);
	}

	public String firstLanguage()
	{
		return languages.get(0);
	}

	public int count()
	{
		return languages.size();
	}

	public boolean containsLanguage(String language)
	{
		return languages.contains(language);
	}

	public boolean isExciting()
	{
		return languages.contains("Java") || languages.contains("Kotlin");
	}

	public List<String> getLanguages()
	{
		return languages;
	}

}
