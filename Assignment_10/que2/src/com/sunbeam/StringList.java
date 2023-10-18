package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Mahendra.");
		strList.add("SunbeamInfotech.");
		strList.add("Nilesh Sir is the best.");
		strList.add("Conciousness is the absolute astheticism.");
		strList.add("Live and let live");

		StringComparator strCmp = new StringComparator();
		String a = Collections.max(strList, strCmp);
		System.out.println("Max in list : "+a);

	}

}
