package com.sunbeam;

public class CountWords {

	public static void main(String[] args) {

		String s1 = "He is a great guy.";
		s1.trim();
		String[] words = s1.split(" ");
		System.out.println("Number of words in string : "+ words.length);
	}

}
