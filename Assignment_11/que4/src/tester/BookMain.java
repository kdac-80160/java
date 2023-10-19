package tester;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.Book;

public class BookMain {

	public static void main(String[] args) {
		
		
		class BookPriceComparator implements Comparator<Book>{
			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		
		BookPriceComparator cmp = new BookPriceComparator();
		
		NavigableSet<Book> library = new TreeSet<>(cmp);
		library.add(new Book("M12",350,"Paulo Coelho",20));
		library.add(new Book("M13",450,"Rocher",30));
		library.add(new Book("M14",750,"Jack Thomson",10));
		library.add(new Book("B15",250,"Nephew Clark",25));
		library.add(new Book("M16",850,"Victoria Smith",35));
		library.add(new Book("M16",950,"Victoria Smith",65));
		
		System.out.println("Forward traversing : ");
		Iterator<Book> itr = library.iterator();
		while(itr.hasNext())
		{
			Book b = itr.next();
			System.out.println(b);
		}
		
		System.out.println("Backward traversing : ");
		Iterator<Book> revitr = library.descendingIterator();
		while(revitr.hasNext())
		{
			Book b = revitr.next();
			System.out.println(b);
		}
	}

}
