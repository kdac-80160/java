package com.sunbeam;

import java.util.Scanner;

public class Book implements Comparable {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
		this.isbn = "";
		this.price = 0;
		this.authorName = "";
		this.quantity = 0;
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public Book(String isbn) {
		this.isbn = isbn;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN : ");
		this.isbn = sc.next();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
		System.out.print("Enter Author Name : ");
		this.authorName = sc.next();
		System.out.print("Enter Quantity : ");
		this.quantity = sc.nextInt();
	}

	public void display() {
		System.out.println("ISBN : " + this.isbn);
		System.out.println("Price : " + this.price);
		System.out.println("Author Name : " + this.authorName);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("---------------------------");
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (obj == this)
//			return true;
//		Book b = (Book) obj;
//		if (this.isbn.compareTo(b.isbn) == 0)
//			return true;
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		int hash = this.isbn.hashCode();
//		return hash;
//	} // NOT NEEDED
	@Override
	public int compareTo(Object b1) {
		Book b = (Book)b1;
		int diff = this.isbn.compareTo(b.isbn);
		return diff;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	
}
