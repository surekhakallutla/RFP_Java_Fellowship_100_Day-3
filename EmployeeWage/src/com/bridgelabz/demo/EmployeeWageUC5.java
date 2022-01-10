package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC5 {
	
	public static void main(String[] args) {
	
			System.out.println("Welcome to Employee Wage Computation Program");
						
			final int ABSENT = 0;
			final int PRESENT = 1;
			final int PART_TIME = 2;
			final int SALARY_PER_HOUR = 20;
			final int TOTAL_WORK_DAY = 20;
			
			int workingHour = 0;
			int TOTAL_SALARY = 0;
			
			for(int i=1; i<=TOTAL_WORK_DAY; i++)
			{
				Random rand = new Random();
				int empCheck = rand.nextInt(3);
				
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
				TOTAL_SALARY = TOTAL_SALARY + (int) empSalary;
			}
			
			System.out.println("Monthly Employee Wage is "+TOTAL_SALARY);
	}
	
}
