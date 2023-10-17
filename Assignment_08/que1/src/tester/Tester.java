package tester;

import com.sunbeam.*;
import com.sunbeam.box.GenericBox;

public class Tester {
	
	public static void main(String[] args) {
		GenericBox<Employee> g1 = new GenericBox<>();
		g1.setObject(new Manager("Mahendra", 24, "Karad", 80160, 150000, 5000));
		System.out.println("Salary : "+g1.getSalary());
		
		g1.setObject(new Salesman("Sarthak", 26, "Ahemadabad", 20145, 56000,2000));
		System.out.println("Salary : "+g1.getSalary());
	}
}
