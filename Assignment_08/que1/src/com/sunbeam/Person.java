package com.sunbeam;

import java.util.Scanner;

	public class Person {
	private String name;
	private String address;
	private int age;
	
	public Person() {
		this.name = "";
		this.address = "";
		this.age = 0;
	}
	
	public Person(String name, int age, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		this.name = sc.next();
		System.out.print("Enter age : ");
		this.age = sc.nextInt();
		System.out.print("Enter address : ");
		this.address = sc.next();
	}
	
	public void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Address : "+this.address);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
