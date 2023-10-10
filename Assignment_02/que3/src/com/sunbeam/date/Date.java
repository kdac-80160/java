package com.sunbeam.date;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		this.day = 0;
		this.month = 0;
		this.year = 0;
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
	
	public void acceptData()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day : ");
		this.day = scanner.nextInt();
		System.out.print("Enter month : ");
		this.month = scanner.nextInt();
		System.out.print("Enter year : ");
		this.year = scanner.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
	}
}
