package test;

import com.exercism.exercise.LogLogLogs.LogLevel;
import com.exercism.exercise.LogLogLogs.LogLine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogLogLogsTest
{
	@Test
	void testGetLogLevel()
	{
		var logLine = new LogLine("[INF]: File deleted");
		var logLine2 = new LogLine("[ERR]: File not found");
		var logLine3 = new LogLine("[CCP]: Dogshit");
		Assertions.assertEquals(LogLevel.INFO, logLine.getLogLevel());
		Assertions.assertEquals(LogLevel.ERROR, logLine2.getLogLevel());
		Assertions.assertEquals(LogLevel.UNKNOWN, logLine3.getLogLevel());
	}

	@Test
	void testGetOutputForShortLog()
	{
		var logLine = new LogLine("[ERR]: Stack Overflow");
		var logLine2 = new LogLine("[CCP] : super dog shit");
		Assertions.assertEquals("6:Stack Overflow", logLine.getOutputForShortLog());
		Assertions.assertEquals("0:super dog shit", logLine2.getOutputForShortLog());
	}
}
