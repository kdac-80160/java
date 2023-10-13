package tester;

import com.sunbeam.employee.BasePlusCommissionEmployee;
import com.sunbeam.employee.CommissionEmployee;
import com.sunbeam.employee.Employee;
import com.sunbeam.employee.HourlyEmployee;
import com.sunbeam.employee.SalariedEmployee;

public class PayrollCalculations {

	public static void main(String[] args) {
		Employee employee = new SalariedEmployee();
		employee.accept();
		System.out.println(employee);
		
		employee = new HourlyEmployee();
		employee.accept();
		System.out.println(employee);
		
		employee = new CommissionEmployee();
		employee.accept();
		System.out.println(employee);
		
		employee = new BasePlusCommissionEmployee();
		employee.accept();
		System.out.println(employee);
	}

}
