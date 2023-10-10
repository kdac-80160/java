package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter point p1 : ");
		Point2D p1 = new Point2D(scanner.nextFloat(), scanner.nextFloat());
		System.out.println("Point p1 : "+p1.getDetails());
		System.out.print("Enter point p2 : ");
		Point2D p2 = new Point2D(scanner.nextFloat(), scanner.nextFloat());
		System.out.println("Point p2 : "+p2.getDetails());
		if(p1.isEqual(p2))
			System.out.println("Points are same.");
		else
			System.out.println("Distance is : "+p1.calculateDistance(p2));
	}

}
