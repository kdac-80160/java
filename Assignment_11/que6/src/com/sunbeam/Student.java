package com.sunbeam;

import java.util.Scanner;

public class Student {
private int rollno;
private String name;
private int age;

public Student() {
	this.rollno = 0;
	this.name = "";
	this.age = 0;
}

public Student(int rollno, String name, int age) {
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}

public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter roll no : ");
	this.rollno = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter name : ");
	this.name = sc.nextLine();
	System.out.print("Enter age : ");
	this.age = sc.nextInt();
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}


}
