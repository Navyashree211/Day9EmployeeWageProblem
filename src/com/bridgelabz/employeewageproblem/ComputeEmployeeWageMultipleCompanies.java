package com.bridgelabz.employeewageproblem;

public class ComputeEmployeeWageMultipleCompanies {
	public static void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		int totalWage = 0;
		int workingHrs = 0;

		System.out.println("Details of " + companyName + "Employee");
		System.out.println("------------------------------------------------");
		System.out.println("Wage per hour:" + wagePerHr);
		System.out.println("Maximum working days:" + maxWorkingDays);
		System.out.println("Maximum working hours:" + maxWorkingHrs);
		System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "total working hrs");

		for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
				&& totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs) {
			int empType = (int) (Math.random() * 100) % 3;
			switch (empType) {
			case FULL_TIME:
				workingHrs = 8;
				break;
			case PART_TIME:
				workingHrs = 4;
				break;
			default:
				workingHrs = 0;
				break;
			}
			int wage = workingHrs * wagePerHr;
			totalWage += wage;
			System.out.printf("%5d     %5d     %5d     %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

		}

	}

	public static void main(String[] args) {
		calculateTotalWage("D-Mart", 8, 15, 200);
		calculateTotalWage("Jio-Mart", 10, 25, 195);
		calculateTotalWage("BigBazar", 6, 24, 160);
		calculateTotalWage("Amazon", 8, 22, 180);

	}

}
