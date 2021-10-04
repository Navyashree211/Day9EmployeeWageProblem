package com.bridgelabz.employeewageproblem;

public class UsingSwitchCase {
	final int FULL_TIME = 2;
	final int PART_TIME = 1;
	final int WAGE_PER_HR = 20;
	int workingHours = 0;
	int empType;

	UsingSwitchCase() {
		empType = (int) (Math.random() * 100) % 3;

		switch (empType) {
		case FULL_TIME:
			System.out.println("Employee is present Full time ");
			workingHours = 8;
			break;
		case PART_TIME:
			System.out.println("Employee is present Part time ");
			workingHours = 4;
			break;
		default:
			System.out.println("Employee is Absent");
		}
		int wage = workingHours * WAGE_PER_HR;
		System.out.println("Employee Daily wage is " + wage);
	}

	public static void main(String[] args) {
		new UsingSwitchCase();

	}

}
