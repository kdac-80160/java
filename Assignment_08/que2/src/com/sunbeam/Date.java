package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

@Override
	public void display() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day : ");
		this.day = sc.nextInt();
		System.out.print("Enter month : ");
		this.month = sc.nextInt();
		System.out.print("Enter year : ");
		this.year = sc.nextInt();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
