package com.exercism.exercise;

import java.util.Objects;

public class Badge
{
	public String print(Integer id, String name, String department)
	{
		String strId = Objects.isNull(id) ? "" : String.format("[%s] - ", id);
		String depart = Objects.isNull(department) ? " - OWNER" : String.format(" - %s", department.toUpperCase());
		return strId + name + depart;

	}

	public static void main(String[] args)
	{
		var badge = new Badge();
		System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
		System.out.println(badge.print(null, "Jane Johnson", "Procurement"));
		System.out.println(badge.print(null, "Charlotte Hale", null));
		System.out.println(badge.print(254, "Charlotte Hale", null));
	}
}
