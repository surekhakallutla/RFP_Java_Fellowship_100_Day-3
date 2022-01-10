package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC4 {
		
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random rand = new Random();
		int empCheck = rand.nextInt(3);
		
		final int ABSENT = 0;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int SALARY_PER_HOUR = 20;
		
		int workingHour = 0;
		
		switch(empCheck)
		{
		
			case PRESENT :
				workingHour = 8;
				break;
			
			case ABSENT :
				workingHour = 0;
				break;
				
			case PART_TIME :
				workingHour = 4;
				break;
			
		}
		
		double  empSalary = workingHour * SALARY_PER_HOUR;
		
		System.out.println("Employee has earned "+empSalary+" rupees today.");
	}

}
