package com.sunbeam.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String firstName, String lastName, int ssn, double salary) {
		super(firstName, lastName, ssn, salary);
	}

	@Override
	void calculateSalary() {
		
	}
	
	@Override
	public void accept() {
		super.accept();
		System.out.print("Enter weekly salary : ");
		this.setSalary(new Scanner(System.in).nextDouble());
	}
	
	@Override
	public String toString() {
		return "Salaried Employee : "+super.toString()+" | "+"Weekly Salary : "+this.getSalary();
	}
	
}
