package tester;

import com.sunbeam.*;

public class Tester {

	public static void printDisplayableBox(GenericBox<? extends Displayable>b)
	{
		b.get().display();
	}
	
	public static void printAnyBox(GenericBox<?>b){
		System.out.println(b.get().toString());
	}
	public static void main(String[] args) {
		GenericBox<Person> p1 = new GenericBox<>();
		p1.setObject(new Person("Mahendra", 24, "Karad"));
		
		GenericBox<Date> d1 = new GenericBox<>();
		d1.setObject(new Date(16,10,2023));
		
		GenericBox<String> s1 = new GenericBox<>();
		s1.setObject(new String("Mahendra"));
		
		printDisplayableBox(p1);
		printDisplayableBox(d1);
		// printDisplayableBox(s1); // error
		printAnyBox(p1);
		printAnyBox(d1);
		printAnyBox(s1);
	}

}
