package com.exercism.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppointmentScheduler
{
	public String capitalize(String str)
	{
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

	public LocalDateTime schedule(String appointmentDateDescription)
	{
		String[] dateTime = appointmentDateDescription.split(" ");
		ArrayList<Integer> date = Arrays.stream(dateTime[0].split("/"))
										.map(Integer::parseInt)
										.collect(
												Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> time = Arrays.stream(dateTime[1].split(":"))
										.map(Integer::parseInt)
										.collect(
												Collectors.toCollection(ArrayList::new));
		return LocalDateTime.of(date.get(2), date.get(0), date.get(1), time.get(0), time.get(1),
								time.get(2));
	}

	public boolean hasPassed(LocalDateTime appointmentDate)
	{
		return appointmentDate.isBefore(LocalDateTime.now());
	}

	public boolean isAfternoonAppointment(LocalDateTime appointmentDate)
	{
		int hour = appointmentDate.getHour();
		return hour >= 12 && hour < 18;

	}

	public String getDescription(LocalDateTime appointmentDate)
	{
		String day = appointmentDate.getDayOfWeek().toString();
		String month = appointmentDate.getMonth().toString();
		int dayOfMonth = appointmentDate.getDayOfMonth();
		int year = appointmentDate.getYear();
		int hour = appointmentDate.getHour() > 12 ? appointmentDate.getHour() - 12 :
				   appointmentDate.getHour();
		String minute = appointmentDate.getMinute() >= 10 ?
						String.valueOf(appointmentDate.getMinute()) : String.valueOf(
				"0" + appointmentDate.getMinute());
		String format = appointmentDate.getHour() >= 12 ? "PM" : "AM";
		return String.format("You have an appointment on %s, %s %d, %d, at %d:%s %s.",
							 capitalize(day),
							 capitalize(month),
							 dayOfMonth, year, hour, minute, format);

	}

	public LocalDate getAnniversaryDate()
	{
		int thisYear = LocalDate.now().getYear();
		return LocalDate.of(thisYear, 9, 15);
	}

}
