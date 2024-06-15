package com.exercism.exercise.LogLogLogs;

public class LogLine
{
	private String logLine;

	public LogLine(String logLine)
	{
		this.logLine = logLine;
	}

	public LogLevel getLogLevel()
	{
		String abbreviation = logLine.split(":")[0].trim();
		return switch (abbreviation)
		{
			case "[TRC]" -> LogLevel.TRACE;
			case "[DBG]" -> LogLevel.DEBUG;
			case "[INF]" -> LogLevel.INFO;
			case "[WRN]" -> LogLevel.WARNING;
			case "[ERR]" -> LogLevel.ERROR;
			case "[FTL]" -> LogLevel.FATAL;
			default -> LogLevel.UNKNOWN;
		};
	}

	public String getOutputForShortLog()
	{
		String content = logLine.split(":")[1].trim();
		int shortForm = getLogLevel().getShortFormat();
		return String.format("%d:%s", shortForm , content);
	}
}
