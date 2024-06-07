package com.exercism.exercise;

public class SalaryCalculator
{
	private final int BASE_SALARY = 1000;
	private final int SALARY_CAP = BASE_SALARY * 2;


	public double salaryMultiplier(int daysSkipped)
	{
		return daysSkipped >= 5 ? 0.85 : 1.0;
	}

	public int bonusMultiplier(int productsSold)
	{
		return productsSold >= 20 ? 13 : 10;
	}

	public double bonusForProductsSold(int productsSold)
	{
		return productsSold * bonusMultiplier(productsSold);
	}

	public double finalSalary(int daysSkipped, int productsSold)
	{
		double grossSalary = salaryMultiplier(daysSkipped) * BASE_SALARY + bonusForProductsSold(
				productsSold);
		return grossSalary <= SALARY_CAP ? grossSalary : SALARY_CAP;
	}
}
