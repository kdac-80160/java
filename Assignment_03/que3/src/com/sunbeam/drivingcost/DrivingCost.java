package com.sunbeam.drivingcost;

import java.util.Scanner;

public class DrivingCost {
	private float milesPerDay;
	private float costPerGallon;
	private float aveMilesPerGallon;
	private float parkFee;
	private int tolls;

	public DrivingCost() {
		this.milesPerDay = 0;
		this.costPerGallon = 0;
		this.aveMilesPerGallon = 0;
		this.parkFee = 0;
		this.tolls = 0;
	}

	public DrivingCost(float milesPerDay, float costPerGallon, float aveMilesPerGallon, float parkFee, int tolls) {
		this.milesPerDay = milesPerDay;
		this.costPerGallon = costPerGallon;
		this.aveMilesPerGallon = aveMilesPerGallon;
		this.parkFee = parkFee;
		this.tolls = tolls;
	}

	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter miles/day : ");
		this.milesPerDay = scanner.nextFloat();
		System.out.print("Enter cost/gallon : ");
		this.costPerGallon = scanner.nextFloat();
		System.out.print("Enter average_miles/gallon : ");
		this.aveMilesPerGallon = scanner.nextFloat();
		System.out.print("Enter parking_fee/day : ");
		this.parkFee = scanner.nextFloat();
		System.out.print("Enter tolls/day : ");
		this.tolls = scanner.nextInt();
	}
	
	public void display() {
		System.out.println("------------------------------");
		System.out.println("Total driving cost/day : "+(this.milesPerDay/this.aveMilesPerGallon*this.costPerGallon+this.tolls+this.parkFee));
		System.out.println("------------------------------");
	}
}
