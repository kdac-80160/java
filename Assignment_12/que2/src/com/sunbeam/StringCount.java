package com.sunbeam;

import java.util.function.Predicate;

public class StringCount {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		
		int count = countIf(arr, element -> element.length()>6);
		
		System.out.println("Number of elements having length more than six : "+count);
	}

}
