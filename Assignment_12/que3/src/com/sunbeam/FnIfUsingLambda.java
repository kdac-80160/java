package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic{
	double calc(double d1, double d2);
}
public class FnIfUsingLambda {
	
	public static void calculate(double d1, double d2, Arithmetic a) {
		
		double result = a.calc(d1, d2);
		System.out.println("Result : "+result);
		
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("****My Calculator****");
			System.out.println("0 : Exit");
			System.out.println("1 : Addition");
			System.out.println("2 : Substraction");
			System.out.println("3 : Multiplication");
			System.out.println("4 : Division");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("---------------------");
			switch(choice)
			{
			case 0: break;
			case 1: System.out.print("Enter two numbers : ");
			calculate(sc.nextDouble(),sc.nextDouble(), (db1,db2) -> db1+db2);
			break;
			case 2: System.out.print("Enter two numbers : ");
			calculate(sc.nextDouble(),sc.nextDouble(), (db1,db2) -> db1-db2);
			break;
			case 3: System.out.print("Enter two numbers : ");
			calculate(sc.nextDouble(),sc.nextDouble(), (db1,db2) -> db1*db2);
			break;
			case 4: System.out.print("Enter two numbers : ");
			calculate(sc.nextDouble(),sc.nextDouble(), (db1,db2) -> db1/db2);
			break;
			default : System.out.println("Enter a valid choice");
			}
		} while (choice!=0);
	}

}
