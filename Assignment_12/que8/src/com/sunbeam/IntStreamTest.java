package com.sunbeam;

import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		System.out.println("Sum is : "+stream.sum());
		//System.out.println(stream.summaryStatistics());

	}

}
