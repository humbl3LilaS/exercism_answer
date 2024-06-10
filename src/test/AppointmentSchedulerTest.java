package test;

import com.exercism.exercise.AppointmentScheduler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentSchedulerTest
{
	@Test
	void schedule()
	{
		AppointmentScheduler scheduler = new AppointmentScheduler();
		Assertions.assertEquals(LocalDateTime.of(2019, 7, 25, 13, 45, 00),
								scheduler.schedule("7/25/2019 13:45:00")
		);
	}

	@Test
	void hasPassed()
	{
		AppointmentScheduler scheduler = new AppointmentScheduler();
		Assertions.assertEquals(true,
								scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));
		Assertions.assertEquals(false,
								scheduler.hasPassed(LocalDateTime.of(2025, 12, 31, 9, 0, 0)));
	}

	@Test
	void isAfternoonAppointment()
	{
		AppointmentScheduler scheduler = new AppointmentScheduler();
		Assertions.assertEquals(true,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 15, 0, 0)));
		Assertions.assertEquals(false,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 11, 59, 0)));
		Assertions.assertEquals(true,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 12, 0, 0)));
		Assertions.assertEquals(false,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 3, 0, 0)));
		Assertions.assertEquals(false,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 18, 1, 0)));
		Assertions.assertEquals(false,
								scheduler.isAfternoonAppointment(
										LocalDateTime.of(2019, 3, 29, 18, 0, 0)));
	}

	@Test
	void getDescription()
	{
		AppointmentScheduler scheduler = new AppointmentScheduler();
		Assertions.assertEquals("You have an appointment on Friday, March 29, 2019, at 3:00 PM.",
								scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
		Assertions.assertEquals("You have an appointment on Friday, March 29, 2019, at 3:45 PM.",
								scheduler.getDescription(LocalDateTime.of(2019, 3, 29, 15, 45, 0)));
		Assertions.assertEquals("You have an appointment on Friday, March 29, 2019, at 3:03 PM.",
								scheduler.getDescription(LocalDateTime.of(2019, 3, 29, 15, 3, 0)));
	}

	@Test
	void getAnniversaryDate()
	{
		AppointmentScheduler scheduler = new AppointmentScheduler();
		Assertions.assertEquals(LocalDate.of(2024, 9, 15), scheduler.getAnniversaryDate());
	}
}
