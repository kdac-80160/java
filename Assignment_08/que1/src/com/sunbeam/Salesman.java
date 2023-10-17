package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	private double commission;

	public Salesman() {
		this.commission = 0;
	}

	public Salesman(String name, int age, String address, int empid, double sal, double commission) {
		super(name, age, address, empid, sal);
		this.commission = commission;
	}

	@Override
	public void accept() {
		super.accept();
		System.out.print("Enter commision : ");
		this.commission = new Scanner(System.in).nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Commission : " + this.commission);
	}

	@Override
	void CalculateSal() {
	System.out.println("Total salary : "+(this.getSal()+this.commission));
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	

}
