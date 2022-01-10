package com.bridgelabz.demo;

import java.util.Random;

public class EmployeeWageUC1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int PRESENT = 1;
		int ABSENT = 0;
		
		Random rand = new Random();
		int empCheck = rand.nextInt(2);
		
		// System.out.println("EmpCheck "+empCheck);

		if (empCheck == PRESENT)
			System.out.println("Employee is Present");
		
		else if (empCheck == ABSENT)
			System.out.println("Employee is Absent");
		
	}
	
}
