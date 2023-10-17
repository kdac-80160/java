package que3;

public class StrCheckPalindrome {

	public static void main(String[] args) {
		String s1 = "mnaanm";
		String reverseStr="";

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseStr=reverseStr+s1.charAt(i);
		}
		if(s1.equals(reverseStr))
			System.out.println("String is a palindrome.");
		else
			System.out.println("String is not a palindrome.");

	}

}
