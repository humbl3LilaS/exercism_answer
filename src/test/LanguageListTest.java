package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.exercism.exercise.LanguageList;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LanguageListTest
{

	@Test
	void isEmpty()
	{
		var testData = new LanguageList();
		assertEquals(true, testData.isEmpty());
	}

	@Test
	void addLanguage()
	{
		var testData = new LanguageList();
		testData.addLanguage("English");
		assertEquals(List.of("English"), testData.getLanguages());
	}

	@Test
	void removeLanguage()
	{
		var testData = new LanguageList();
		testData.addLanguage("Japanese");
		testData.addLanguage("English");
		testData.addLanguage("Japanese");
		testData.removeLanguage("Japanese");
		assertEquals(List.of("English", "Japanese"), testData.getLanguages());
	}

	@Test
	void fistLanguage()
	{
		var testData = new LanguageList();
		testData.addLanguage("Japanese");
		testData.addLanguage("English");
		testData.addLanguage("Japanese");
		assertEquals("Japanese", testData.firstLanguage());
	}

	@Test
	void count() {
		var testData = new LanguageList();
		testData.addLanguage("Japanese");
		testData.addLanguage("English");
		assertEquals(2, testData.count());
	}

	@Test
	void containsLanguage() {
		var testData = new LanguageList();
		testData.addLanguage("Japanese");
		testData.addLanguage("English");
		assertEquals(true, testData.containsLanguage("Japanese"));
		assertEquals(false, testData.containsLanguage("French"));
	}

	@Test
	void isExciting() {
		var testData = new LanguageList();
		testData.addLanguage("Japanese");
		testData.addLanguage("English");
		assertEquals(false, testData.isExciting());

		var testDataTwo = new LanguageList();
		testDataTwo.addLanguage("Java");
		testDataTwo.addLanguage("python");
		assertEquals(true, testDataTwo.isExciting());
	}
}