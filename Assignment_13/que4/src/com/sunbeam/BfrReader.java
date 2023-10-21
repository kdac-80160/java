package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class BfrReader {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/home/mahendra/A_Assignments/JAVA/java/Assignment_13/que3/file.txt")) {
			try (BufferedReader bfr = new BufferedReader(fr)) {
				String s;
				while ((s = bfr.readLine()) != null)
					System.out.println(s);
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println("Executed Successfully.");
	}

}
