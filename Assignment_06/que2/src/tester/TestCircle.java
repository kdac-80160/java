package tester;

import java.util.Scanner;

import com.sunbeam.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		try {
			circle.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
