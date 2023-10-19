package tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.Book;

public class BookMain {

	public static void main(String[] args) {
		Set<Book> library = new TreeSet<>();
		library.add(new Book("M12",350,"Paulo Coelho",20));
		library.add(new Book("M13",450,"Rocher",30));
		library.add(new Book("M14",750,"Jack Thomson",10));
		library.add(new Book("B15",250,"Nephew Clark",25));
		library.add(new Book("M16",850,"Victoria Smith",35));
		library.add(new Book("M16",950,"Victoria Smith",65));
		
		Iterator<Book> itr = library.iterator();
		while(itr.hasNext())
		{
			Book b = itr.next();
			System.out.println(b);
		}
	}

}
