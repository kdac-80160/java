import java.util.Scanner;

public class Asgn_01_Q2 {

	public static void main(String[] args)
	{
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble(); 
		if(num1%1==0 || num2%1==0)
		System.out.println("ERORR : Exception for datatype not matching with double.");
		else
			System.out.println("Average is : "+(num1+num2)/2);
	}

}