import java.util.Scanner;

class Asgn_01_Q1
{
	
	
	public static void main(String[] args)
	{
		int number;
		System.out.print("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Binary Equivalnet : "+Integer.toBinaryString(number));
		System.out.println("Ocatal Equivalent  : "+Integer.toOctalString(number));
		System.out.println("Hexadecimal Equivalent : "+Integer.toHexString(number));	}

}