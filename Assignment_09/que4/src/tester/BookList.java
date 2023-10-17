package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;

public class BookList {

	public static void main(String[] args) {
		int choice;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		List<Book> library = new ArrayList<Book>();
		do {
			System.out.println("---------------------------");
			System.out.println("**Wisdom Library**");
			System.out.println("0 : Exit");
			System.out.println("1 : Add Book");
			System.out.println("2 : Display Books");
			System.out.println("3 : Delete Book");
			System.out.println("4 : Check Book");
			System.out.println("5 : Delete all");
			System.out.println("6 : Display Number of Books");
			System.out.println("7 : Sort Books");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("---------------------------");
			switch (choice) {
			case 1:
				library.add(new Book());
				library.get(library.size() - 1).accept();
				System.out.println("---------------------------");
				System.out.println("Book added successfully.");
				break;
			case 2:
				for (Book b : library)
					b.display();
				break;
			case 3:
				System.out.print("Enter the index : ");
				library.remove(sc.nextInt());
				System.out.println("Book deleted successfully.");
				break;
			case 4:
				System.out.print("Enter ISBN : ");
				if (library.contains(new Book(sc.next())))
					System.out.println("Book Exists");
				else
					System.out.println("Book does not exist.");
				break;
			case 5:
				library.clear();
				System.out.println("Deleted all");
				break;
			case 6:
				System.out.println("Total Books : " + library.size());
				break;
			case 7:
				library.sort(new ComparatorSort());
				System.out.println("Sorted Successfully.");
				break;
			default:
				System.out.println("Please enter a valid choice.");
			}
		} while (choice != 0);

	}

}
