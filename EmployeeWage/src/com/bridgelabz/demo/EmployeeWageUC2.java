package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC2 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random rand = new Random();
		int empCheck = rand.nextInt(2);
		
		System.out.println("EmpCheck" +empCheck);
		
		int ABSENT = 0;
		int PRESENT = 1;
		int SALARY_PER_HOUR = 20;
		int workingHour = 0;
		
		if (empCheck == PRESENT) 
		{
			workingHour = 8;
		}
		
		else if(empCheck == ABSENT)
		{
			workingHour = 0;
		}
		
		double  empSalary = workingHour * SALARY_PER_HOUR;
		
		System.out.println("Employee has earned "+empSalary+" rupees today.");
	}

}
