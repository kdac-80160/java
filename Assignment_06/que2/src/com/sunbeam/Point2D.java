package com.sunbeam;

import java.util.Scanner;

public class Point2D {
	private float x;
	private float y;

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		this.x = sc.nextFloat();
		System.out.print("Enter y : ");
		this.y = sc.nextFloat();
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getDetails() {
		return "(" + x + "," + " " + y + ")";
	}

	public boolean isEqual(Point2D point) {
		if (this.x == point.x && this.y == point.y)
			return true;
		else
			return false;
	}

	public double calculateDistance(Point2D point) {
		return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
	}
}
