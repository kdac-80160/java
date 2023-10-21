package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BfwClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("file.txt")) {
			BufferedWriter bfw = new BufferedWriter(fw);
			for (int i = 1; i <= 4; i++) {
				System.out.print("Enter the string : ");
				String s = sc.nextLine();
				bfw.write(s);
				bfw.newLine();
			}
			bfw.flush();
		} catch (Exception e) {

		}
		System.out.println("Strings Added Successfully");
	}

}
