package com.sunbeam.employee;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	private double salary;
	
	public Employee() {

	}

	public Employee(String firstName, String lastName, int ssn, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		this.firstName = sc.next();
		System.out.print("Enter Last Name : ");
		this.lastName = sc.next();
		System.out.print("Enter SSN : ");
		this.ssn = sc.nextInt();
	}
	
	abstract void calculateSalary();
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName+" | "+"SSN : "+this.ssn;
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

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
