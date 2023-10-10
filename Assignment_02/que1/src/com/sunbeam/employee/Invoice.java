package com.sunbeam.employee;

import java.util.Scanner;

public class Invoice {
	private String partNum;
	private String desc;
	private int qty;
	private double price;
	
	public Invoice() {
		this.partNum = "";
		this.desc = "";
		this.qty = 0;
		this.price = 0.0;
	}
	
	public Invoice(String partNum, String desc, int qty, double price)
	{
		this.partNum = partNum;
		this.desc = desc;
		this.qty = qty;
		this.price = price;
		if(this.price<0)
			this.price = 0;
		if (this.qty<0)
			this.qty = 0;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateAmt()
	{
		return this.price*this.qty;
	}
	
	public void acceptData()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter part number : ");
		this.partNum = scanner.next();
		System.out.print("Enter description : ");
		this.desc = scanner.next();
		System.out.print("Enter quantity : ");
		this.qty = scanner.nextInt();
		System.out.print("Enter price : ");
		this.price = scanner.nextDouble();
		if(this.price<0)
			this.price = 0;
		if (this.qty<0)
			this.qty = 0;
	}
	
	public void displayData()
	{
		System.out.println("Part Number : "+this.partNum);
		System.out.println("Desc : "+this.desc);
		System.out.println("Quantity : "+this.qty);
		System.out.println("Price : "+this.price);
	}
}
