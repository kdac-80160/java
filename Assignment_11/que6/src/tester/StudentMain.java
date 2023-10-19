package tester;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.sunbeam.Student;;

public class StudentMain {

	public static void main(String[] args) {
		int choice;
		Student s;
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> studentlist = new LinkedHashMap<>();
		studentlist.put(80160, new Student(80160, "Mahendra", 24));
		studentlist.put(80160, new Student(80160, "Mac", 25));
		studentlist.put(80112, new Student(80112, "Afnan", 22));
		studentlist.put(80124, new Student(80124, "Vanshika", 20));
		studentlist.put(80166, new Student(80166, "Sarthak", 27));
		studentlist.put(80455, new Student(80455, "Dishant", 30));

		do {
			System.out.println("**Sanskar Valley Public School**");
			System.out.println("--------------------------------");
			System.out.println("0 : Exit");
			System.out.println("1 : Add Student");
			System.out.println("2 : Find Student");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("--------------------------------");
			switch (choice) {
			case 0:
				break;
			case 1:
				s = new Student();
				s.accept();
				studentlist.put(s.getRollno(), s);
				System.out.println("Student added Successfully");
				break;
			case 2:
				System.out.println("Enter rollno to find : ");
				s = studentlist.get(sc.nextInt());
				if (s == null)
					System.out.println("Student not found.");
				else
					System.out.println(s);
				break;
			default:
				System.out.println("Enter a valid choice.");

			}
		} while (choice != 0);
	}

}
