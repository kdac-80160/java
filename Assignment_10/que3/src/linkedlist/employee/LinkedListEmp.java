package linkedlist.employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.employee.Employee;

public class LinkedListEmp {

	public static void main(String[] args) {
		List<Employee> empList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		// add delete find sort edit/update
		Employee e;
		empList.add(new Employee("Mahendra", 24, "Karad",80160,150000));
		empList.add(new Employee("Sarthak", 25, "Karad",80124,12000));
		empList.add(new Employee("Saurabh", 27, "Karad",80166,25000));
		empList.add(new Employee("Vanya", 30, "Karad",80999,12000));
		int empId, index;
		int choice;
		do {
			System.out.println("------------------------");
			System.out.println("0 : Exit");
			System.out.println("1 : Add Employee");
			System.out.println("2 : Delete Employee");
			System.out.println("3 : Find Employee");
			System.out.println("4 : Update/Edit Employee");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("------------------------");

			switch (choice) {
			case 0:
				break;
			case 1:
				e = new Employee();
				e.accept();
				empList.add(e);
				System.out.println("Employee added successfully.");
				break;
			case 2:
				System.out.print("Enter employee id to delete : ");
				empId = sc.nextInt();
				e = new Employee(empId);
				index = empList.indexOf(e);
				if (index == -1)
					System.out.println("Employee does not exist.");
				else {
					empList.remove(index);
					System.out.println("Employee removed successfully.");
				}
				break;
			case 3:
				System.out.print("Enter employee id to find : ");
				empId = sc.nextInt();
				e = new Employee(empId);
				index = empList.indexOf(e);
				if (index == -1)
					System.out.println("Employee does not exist.");
				else {
					empList.get(index).display();
				}
				break;
			case 4:
				System.out.print("Enter employee id to delete : ");
				empId = sc.nextInt();
				e = new Employee(empId);
				index = empList.indexOf(e);
				if (index == -1)
					System.out.println("Employee does not exist.");
				else {
					System.out.println("Enter new details : ");
					empList.get(index).accept();
					System.out.println("Employee updated successfully.");
				}
				break;
			case 5:
				EmployeeComparator empcmp = new EmployeeComparator();
				empList.sort(empcmp);
				System.out.println("List sorted successfully.");
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		} while (choice != 0);

	}

}
