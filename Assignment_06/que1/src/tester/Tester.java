package tester;

import java.util.Scanner;

import com.sunbeam.ExceptionLineTooLong;

public class Tester {

	public static String acceptString() {
		System.out.print("Enter a string : ");
		String s = new Scanner(System.in).next();
		if (s.length() > 80)
			throw new ExceptionLineTooLong(2004,"The string is too long");
		return s;
	}

	public static void main(String[] args) {
		try
		{
			acceptString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
