package com.sunbeam.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee() {
	
	}
	public CommissionEmployee(String firstName, String lastName, int ssn, double salary) {
		super(firstName, lastName, ssn, salary);
	}

	@Override
	void calculateSalary() {
		this.setSalary(this.commissionRate*this.grossSales/100);
	}

	@Override
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gross Sales : ");
		this.grossSales = sc.nextDouble();
		System.out.print("Enter Commission Rate : ");
		this.commissionRate = sc.nextDouble();
		calculateSalary();
	}
	
	@Override
	public String toString() {
		return "Commission Employee : "+super.toString()+" | "+"Gross sales : "+this.grossSales+" | "+"Commission Rate : "+this.commissionRate+" | "+"Salary : "+this.getSalary();
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
}
