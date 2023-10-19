package tester;

import java.util.*;
import java.util.Map.Entry;

import com.sunbeam.Book;

public class BookMain {

	public static void main(String[] args) {
		Map<String,Book> library = new HashMap<>();
		library.put("M12",new Book("M12",350,"Paulo Coelho",20));
		library.put("M13",new Book("M13",450,"Rocher",30));
		library.put("M14",new Book("M14",750,"Jack Thomson",10));
		library.put("M15",new Book("M15",650,"Nephew Clark",25));
		library.put("M16",new Book("M16",850,"Victoria Smith",35));
		library.put("M16",new Book("M16",950,"Victoria Smith",65));
		
		Set<Entry<String,Book>> entry = library.entrySet();
		for(Entry<String,Book> e1: entry)
			System.out.println(e1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Isbn for searching : ");
		Book b = library.get(sc.next());
		if(b==null)
			System.out.println("Book not found.");
		else
			System.out.println(b);
		
	}

}
