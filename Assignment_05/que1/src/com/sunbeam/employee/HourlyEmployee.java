package com.sunbeam.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double workingHours;

	public HourlyEmployee() {
	
	}
	public HourlyEmployee(String firstName, String lastName, int ssn, double salary) {
		super(firstName, lastName, ssn, salary);
	}

	@Override
	void calculateSalary() {
		if(this.workingHours<=40)
			this.setSalary(this.hourlyWage*this.workingHours);
		if(this.workingHours>40)
			this.setSalary(this.hourlyWage*40+((this.workingHours-40)*this.hourlyWage*1.5));
	}

	@Override
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter working hours : ");
		this.workingHours = sc.nextDouble();
		System.out.print("Enter hourly wage : ");
		this.hourlyWage = sc.nextDouble();
		this.calculateSalary();
	}
	
	@Override
	public String toString() {
		return "Hourly Employee : "+super.toString()+" | "+"Hourly Wage : "+this.hourlyWage+" | "+"Working Hours : "+this.workingHours+" | "+"Salary : "+this.getSalary();
	}

}
