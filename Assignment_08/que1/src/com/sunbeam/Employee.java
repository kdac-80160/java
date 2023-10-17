package com.sunbeam;

import java.util.Scanner;

abstract public class Employee extends Person {
	private int empid;
	private double sal;

	public Employee() {

	}

	public Employee(String name, int age, String address, int empid, double sal) {
		super(name, age, address);
		this.empid = empid;
		this.sal = sal;
	}

	@Override
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.print("Enter empid : ");
		this.empid = sc.nextInt();
		System.out.print("Enter sal : ");
		this.sal = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Empid : " + this.empid);
		System.out.println("Salary : " + this.sal);
	}

	abstract void CalculateSal();

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
