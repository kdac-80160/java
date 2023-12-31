package tester;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.sunbeam.Book;

public class BookList {

	public static void main(String[] args) {
		int choice;
		int index;
		Book b;
		Scanner sc = new Scanner(System.in);
		List<Book> library = new ArrayList<Book>();
//		library.add(new Book("M11", 1200, "Nikolus", 10));
//		library.add(new Book("M12", 4400, "Selena", 15));
//		library.add(new Book("M13", 5600, "Jack Thomson", 19));
//		library.add(new Book("M14", 8800, "Paulo Coelho", 20));
//		library.add(new Book("M15", 9900, "Micheal", 21));
		do {
			System.out.println("---------------------------");
			System.out.println("**Wisdom Library**");
			System.out.println("0 : Exit");
			System.out.println("1 : Add Book");
			System.out.println("2 : Display Books");
			System.out.println("3 : Search Book");
			System.out.println("4 : Delete Book by Index");
			System.out.println("5 : Delete Book by ISBN");
			System.out.println("6 : Reverse List");
			System.out.println("7 : Save Books");
			System.out.println("8 : Load Books");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("---------------------------");
			switch (choice) {
			case 0:
				break;
			case 1:
				b = new Book();
				b.accept();
				if (library.contains(b)) {
					Book temp = library.get(library.indexOf(b));
					temp.setQuantity(b.getQuantity() + b.getQuantity());
				} else
					library.add(b);
				System.out.println("---------------------------");
				System.out.println("Book added successfully.");
				break;
			case 2:
				for (int i = 0; i < library.size(); i++)
					library.get(i).display();
				break;
			case 3:
				System.out.print("Enter ISBN : ");
				index = library.indexOf(new Book(sc.next()));
				if (index == -1)
					System.out.println("Book does not exist");
				else
					library.get(index).display();
				break;
			case 4:
				System.out.print("Enter the index : ");
				index = sc.nextInt();
				if (index >= 0 && index < library.size()) {
					library.remove(index);
					System.out.println("Book deleted successfully.");
				} else
					System.out.println("Wrong index entered.");
				break;
			case 5:
				System.out.print("Enter ISBN : ");
				index = library.indexOf(new Book(sc.next()));
				if (index == -1)
					System.out.println("Book does not exist");
				else {
					library.remove(index);
					System.out.println("Book deleted successfully.");
				}
				break;
			case 6:
				Collections.reverse(library);
				System.out.println("Reversed Successfully.");
				break;
			case 7:
				try (FileOutputStream fout = new FileOutputStream("Books.txt")) {
					
					try(DataOutputStream dout = new DataOutputStream(fout))
					{
					for (Book book : library) {
						dout.writeUTF(book.getIsbn());
						dout.writeDouble(book.getPrice());
						dout.writeUTF(book.getAuthorName());
						dout.writeInt(book.getQuantity());
					}
					}
				} catch (Exception e) {
					// e.printStackTrace();
				}
				System.out.println("All books saved successfully.");
				break;
			case 8:
				try (FileInputStream fin = new FileInputStream("Books.txt")) {
					try(DataInputStream din = new DataInputStream(fin)){
					while(true)
					{
						Book book = new Book();
						book.setIsbn(din.readUTF());
						book.setPrice(din.readDouble());
						book.setAuthorName(din.readUTF());
						book.setQuantity(din.readInt());
						library.add(book);
					}
					}
				} catch (Exception e) {
					// e.printStackTrace();
				}
				System.out.println("Books loaded sucessfully.");
				break;

			default:
				System.out.println("Please enter a valid choice.");
			}
		} while (choice != 0);
		System.out.println("Thank you for using the application.");
	}

}
