package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC6 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
					
		final int ABSENT = 0;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int SALARY_PER_HOUR = 20;
		final int TOTAL_WORK_DAY = 20;
		final int MAX_WORKING_HOURS = 100;
		final int FULL_DAY_WORKING_HOUR = 8;
		
		int workingHour = 0;
		int TOTAL_SALARY = 0;
		int Day=0;
		
		while(Day < TOTAL_WORK_DAY && ((workingHour + FULL_DAY_WORKING_HOUR ) <= MAX_WORKING_HOURS))
		{
	
			Random rand = new Random();
			int empCheck = rand.nextInt(3);
			
			Day++;
			
			switch(empCheck)
			{
			
				case PRESENT :
					workingHour += FULL_DAY_WORKING_HOUR;
					break;
				
				case ABSENT :
					workingHour += 0;
					break;
					
				case PART_TIME :
					workingHour += (FULL_DAY_WORKING_HOUR/2);
					break;
				
			}
		
			System.out.println("Working day: "+Day+"\tPRESENT: "+empCheck);
			
		}	
		
		TOTAL_SALARY = workingHour * SALARY_PER_HOUR;
		
		System.out.println("Monthly Employee Wage is "+TOTAL_SALARY);
		System.out.println("Total Working Hours is "+workingHour);
	}
	
	

}
