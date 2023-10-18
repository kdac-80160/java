package linkedlist.employee;

import java.util.Comparator;

import com.sunbeam.employee.Employee;

public class EmployeeComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = e1.getEmpid() - e2.getEmpid();
		return diff;
	}
}
