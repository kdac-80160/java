package com.sunbeam.employee;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee() {
	
	}
	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn, double salary) {
		super(firstName, lastName, ssn, salary);
	}
	
	@Override
	public void accept() {
		super.accept();
		System.out.print("Enter Base Salary : ");
		this.baseSalary = new Scanner(System.in).nextDouble();
		calculateSalary();
	}
	
	@Override
	void calculateSalary() {
		this.setSalary(this.getGrossSales()*this.getCommissionRate()/100+this.baseSalary*1.1);
	}
	
	@Override
	public String toString() {
		return "Base Salaried Commission Employee : "+super.toString()+" | "+"(Base Salary : "+this.baseSalary+")";
	}
	}


