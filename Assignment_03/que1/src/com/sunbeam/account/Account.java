package com.sunbeam.account;

import java.util.Scanner;

public class Account {

	private int accNum;
	private int balance;
	private int chargeTotal;
	private int creditTotal;
	private int creditLimit;

	public Account() {
		this.accNum = 0;
		this.balance = 0;
		this.chargeTotal = 0;
		this.creditLimit = 15000;
	}

	public Account(int accNum, int balance, int chargeTotal) {
		this.accNum = accNum;
		this.balance = balance;
		this.chargeTotal = chargeTotal;
		this.creditLimit = 15000;
	}

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account num : ");
		this.accNum = scanner.nextInt();
		System.out.print("Enter the balance : ");
		this.balance = scanner.nextInt();
		System.out.print("Enter total charge : ");
		this.chargeTotal = scanner.nextInt();
		System.out.print("Enter total credit : ");
		this.creditTotal = scanner.nextInt();
		this.balance = this.balance + this.chargeTotal - this.creditTotal;
	}

	public void display() {
		System.out.println("Account no : " + this.accNum);
		System.out.println("Balance : " + this.balance);
		System.out.println("Credit Limit : "+this.creditLimit);
		if(this.balance>this.creditLimit)
			System.out.println("Credit limit exceeded.");
	}
}
