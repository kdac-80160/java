package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		this.bonus = 0;
	}

	public Manager(String name, int age, String address, int empid, double sal, double bonus) {
		super(name, age, address, empid, sal);
		this.bonus = bonus;
	}

	@Override
	public void accept() {
		super.accept();
		System.out.print("Enter bonus : ");
		this.bonus = new Scanner(System.in).nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus : " + this.bonus);
	}
	
	@Override
	void CalculateSal() {
		System.out.print("Total salary : "+(this.getSal()+this.bonus));
	}
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
