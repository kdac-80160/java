package com.sunbeam;

public class Manager implements Emp {
private double basicSalary;
private double dearanceAllowance;

public Manager() {
}

public Manager(double basicSalary, double dearanceAllowance) {
	this.basicSalary = basicSalary;
	this.dearanceAllowance = dearanceAllowance;
}

@Override
	public double getSal() {
		
		return this.basicSalary + this.dearanceAllowance;
	}

@Override
	public double calcIncentives() {

		return this.basicSalary*.20;
	}
}
