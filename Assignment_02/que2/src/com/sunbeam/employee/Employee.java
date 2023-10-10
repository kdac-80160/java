package com.sunbeam.employee;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 0.0;
	}

	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (salary > 0)
			this.salary = salary;
	}

	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first name : ");
		this.firstName = scanner.next();
		System.out.print("Enter last name : ");
		this.lastName = scanner.next();
		System.out.print("Enter salary : ");
		double salary = scanner.nextDouble();
		if (salary > 0)
			this.salary = salary;
	}

	public void displayData() {
		System.out.println("First Name : " + this.firstName);
		System.out.println("Last Name : " + this.lastName);
		System.out.println("Salary : " + this.salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
