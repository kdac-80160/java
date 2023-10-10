package employeetest;

import com.sunbeam.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
			Employee employee1 = new Employee();
			Employee employee2 = new Employee();
			employee1.acceptData();
			employee2.acceptData();
			System.out.println("Yearly Salary for Employee1 : "+employee1.getSalary()*12);
			System.out.println("Yearly Salary for Employee2 : "+employee2.getSalary()*12);

	}

}
