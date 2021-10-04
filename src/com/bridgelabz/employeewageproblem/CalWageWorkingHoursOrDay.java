package com.bridgelabz.employeewageproblem;

public class CalWageWorkingHoursOrDay {   
	final int FULL_TIME = 2;
	final int PART_TIME = 1;
	final int WAGE_PER_HR = 20;
	final int MAX_WORKING_DAYS = 20;
	final int MAX_WORKING_HRS = 100;

	int workingHours = 0;
	int totalWage = 0;
	int empType;

	CalWageWorkingHoursOrDay() {

		System.out.printf("%5s     %5s     %5s     %5s\n", "Day",  
				"Workinghrs", "Wage", "Total working hrs");          //%5s prints out the string left padded by space until the total length is 5.

		for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
				&& totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHours) {
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
			totalWage += wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage,
					totalWorkingHrs + workingHours);
		}
		System.out.println("Total wage for a month is " + totalWage);
	}

	public static void main(String[] args) {
		new CalWageWorkingHoursOrDay();
	}

}
