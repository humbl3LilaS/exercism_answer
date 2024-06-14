package test;

import com.exercism.exercise.FootballMatchReports;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootballMatchReportsTest
{

	@Test
	void testOnField()
	{
		Assertions.assertEquals("goalie", FootballMatchReports.onField(1));
		Assertions.assertEquals("left back", FootballMatchReports.onField(2));
		Assertions.assertEquals("center back", FootballMatchReports.onField(3));
		Assertions.assertEquals("midfielder", FootballMatchReports.onField(7));
		Assertions.assertEquals("right back", FootballMatchReports.onField(5));
		Assertions.assertEquals("striker", FootballMatchReports.onField(10));
	}
}
