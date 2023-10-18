package com.sunbeam;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		int diff = s1.length() - s2.length(); 
		return diff;
	}
}
