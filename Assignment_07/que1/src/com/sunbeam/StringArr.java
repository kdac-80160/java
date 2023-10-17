package com.sunbeam;

public class StringArr {

	public static void main(String[] args) {

		String[] arr = { "MAC", "hey", "LPK" };
		String[] arr2 = { "MAC", "LPK", "lpk" };

		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr2.length; j++)
			if (arr[i].equals(arr2[j])) {
				System.out.println(arr[i] + " is equal to " + arr2[j]);
			}
		}
	}
}
