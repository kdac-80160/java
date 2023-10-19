package com.sunbeam;

import java.util.*;

public class CollectionClasses {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>(); //null allowed with duplicates
		//Collection<String> c = new HashSet<>(); //null allowed but no duplicates
		//Collection<String> c = new LinkedHashSet<>();//null allowed but no duplicates
		//Collection<String> c = new TreeSet<>();// does not allow nulls
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
