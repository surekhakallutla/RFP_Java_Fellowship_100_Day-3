package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC3 {
	
	public static void main(String[] args) {
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			Random rand = new Random();
			int empCheck = rand.nextInt(3);
			
			int ABSENT = 0;
			int PRESENT = 1;
			int PART_TIME = 2;
			int SALARY_PER_HOUR = 20;
			int workingHour = 0;
			
			if (empCheck == PRESENT) 
				workingHour = 8;
					
			else if(empCheck == ABSENT)
				workingHour = 0;
					
			else 
				workingHour = 4;
			
			double  empSalary = workingHour * SALARY_PER_HOUR;
			
			System.out.println("Employee has earned "+empSalary+" rupees today.");
		}

}
