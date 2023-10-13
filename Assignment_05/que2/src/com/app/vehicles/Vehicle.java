package com.app.vehicles;

import java.util.Scanner;

public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;

	public Vehicle() {

	}

	public Vehicle(int chasisNo, String color, double price) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Vehicle))
			return false;
		
		Vehicle vehicle = (Vehicle) obj;
		return this.chasisNo == vehicle.chasisNo;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Chasis No : ");
		this.chasisNo = sc.nextInt();
		System.out.print("Enter the color : ");
		this.color = sc.next();
		System.out.print("Enter the price : ");
		this.price = sc.nextDouble();
	}
}
