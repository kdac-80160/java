package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static int menu() {
		int choice;
		System.out.println("------------------------------");
		System.out.println("1 : Display Details of a point");
		System.out.println("2 : Display all points");
		System.out.println("3 : Check two points");
		System.out.println("4 : Exit");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of points : ");

		Point2D[] points = new Point2D[scanner.nextInt()];

		for (int i = 0; i < points.length; i++) {
			System.out.print("Enter point for index " + i+" : ");
			points[i] = new Point2D(scanner.nextInt(), scanner.nextInt());
		}
		int choice;
		while ((choice = menu()) != 4) {
			switch (choice) {
			case 1:
				{int index;
				System.out.print("Enter index : ");
				index = scanner.nextInt();
				if (index >= 0 && index < points.length)
					System.out.println("Point : " + points[index].getDetails());
				else
					System.out.println("ERROR 404 : Invalid Index.. Try again!");
				}
				break;
			case 2:
				for (int i = 0; i < points.length; i++)
					System.out.println("Point at index " + i + " : " + points[i].getDetails());
				break;
			case 3:
				{
					int index1, index2;
					System.out.print("Enter two indices : ");
				index1 = scanner.nextInt();
				index2 = scanner.nextInt();
				if(index1<0 || index1>=points.length || index2<0 || index2>=points.length)
				{
					System.out.println("ERROR 404 : Invalid Index.. Try again!");
					break;
				}
				if(points[index1].isEqual(points[index2]))
						System.out.println("Points are equal.");
				else
					System.out.println("Distance is : "+points[index1].calculateDistance(points[index2]));
				}
				break;
				default : System.out.println("Wrong choice entered.. :(");
			}

		}
		System.out.println("Thank you for using the application.. :)");
	}

}
