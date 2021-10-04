package com.bridgelabz.employeewageproblem;

public class AddPartTimeEmployeeWage {
	final int PART_TIME = 1;
	final int FULL_TIME = 2;
	final int WAGE_PER_HR = 20;
	int empType;
	int workingHours = 0;

	AddPartTimeEmployeeWage() {
		empType = (int) (Math.random() * 100) % 2;

		if (empType == FULL_TIME) {
			System.out.println("Employee Present");
			workingHours = 8;
		} else if (empType == PART_TIME) {
			System.out.println("Employee is Present Part time");
			workingHours = 4;
		} else {
			System.out.println("Employee Absent");
		}
		int wage = workingHours * WAGE_PER_HR;
		System.out.println("Employee Daily Wage is " + wage);
	}

	public static void main(String[] args) {
		new AddPartTimeEmployeeWage();

	}
}
