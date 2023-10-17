package com.sunbeam;

import java.util.Scanner;

import exception.CircleException;

public class Circle {
	private Point2D centerPoint;
	private double diameter;

	public Circle() {
		this.diameter = 0;
		this.centerPoint = new Point2D();
	}
	
	
	public Circle(float x, float y, double diameter) {
		this.centerPoint.setX(x);
		this.centerPoint.setY(y);
		if(diameter<0)
			throw new RuntimeException("Diameter cannot be nagative",new CircleException(diameter, "Diameter"));
		this.diameter = diameter;
	}


	public void accept() {
		Scanner sc = new Scanner(System.in);
		this.centerPoint.accept();
		System.out.print("Enter the diameter : ");
		double tempdia;
		tempdia = sc.nextDouble();
		if(tempdia<0)
			throw new RuntimeException("Diameter cannot be nagative", new CircleException(tempdia, "Diameter"));
		else this.diameter=tempdia;
	}
	
	public void display()
	{
		System.out.println("Center : "+this.centerPoint.getDetails());
		System.out.println("Diameter : "+this.diameter);
	}


	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint + ", diameter=" + diameter + "]";
	}
	
	
	
}
