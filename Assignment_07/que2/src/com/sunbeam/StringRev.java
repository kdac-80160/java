package com.sunbeam;

public class StringRev {

	public static void main(String[] args) {
		String s1="Hello world";
		System.out.println("Original string : "+s1);
		System.out.print("Reverse string using loop : ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}

		System.out.println();
		StringBuilder s2=new StringBuilder("Hello World");
		s2.reverse();
		System.out.print("Reverse using method : "+s2);

	}

}
