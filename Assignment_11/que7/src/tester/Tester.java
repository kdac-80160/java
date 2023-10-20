package tester;

import com.sunbeam.*;

public class Tester {

	public static void main(String[] args) {
		Emp []arr = new Emp[3];
		arr[0] = new Manager(10000,5000);
		arr[1] = new Labor(500,100);
		arr[2] = new Clerk(3000);
		Double total = Emp.CalculateTotalSalary(arr);
		System.out.println("Total is : "+total);
	}

}
