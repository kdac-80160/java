package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class FactorialUsingStream {

	public static void main(String[] args) {
		System.out.println("**Factorial**");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		Stream<Integer> sb = Stream.iterate(1, x -> x+1);
		Integer factorial = sb.limit(sc.nextInt())
		.reduce(1, (x,y)-> x*y);
		System.out.println("Factorial : "+factorial);

	}

}
