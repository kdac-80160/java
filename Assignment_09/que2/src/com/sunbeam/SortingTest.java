package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTest {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) { // ((Comparable)arr[i]).compareTo(arr[j])
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 44, 2, 33, 23, 89, 12, 44 };
		
		class ComparatorInt implements Comparator<Integer>{
			@Override
			public int compare(Integer arg0, Integer arg1) {
				int diff = arg0.intValue() - arg1.intValue();
				return diff;
			}
		}
		ComparatorInt c = new ComparatorInt();
		
		selectionSort(arr, c);
		for(Integer arr1:arr)
		System.out.println(arr1);
	}

}
