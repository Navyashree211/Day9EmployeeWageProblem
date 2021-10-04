package com.bridgelabz.employeewageproblem;

public class CalculateDailyWageEmp {
	final int present = 1;
	final int WAGE_PER_HR = 20;
	int workingHours = 0;
	int empType;

	CalculateDailyWageEmp() {
		empType = (int) (Math.random() * 100) % 2;

		if (empType == present) {
			System.out.println("Employee Present");
			workingHours = 8;
		} else {
			System.out.println("Employee Absent");
		}
		int wage = workingHours * WAGE_PER_HR;
		System.out.println("Employee Daily Wage is " + wage);
	}

	public static void main(String[] args) {
		new CalculateDailyWageEmp();

	}

}
