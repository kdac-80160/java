package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class RandomSum {

	public static void main(String[] args) {
		Random s1 = new Random();
		Stream<Integer> str = Stream.generate(()->s1.nextInt(10));
		Integer sum = str.
				limit(10).
				reduce(0,(x,y)-> x+y);
		System.out.println("Sum of random numbers is : "+sum);
	}

}
