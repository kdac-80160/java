import java.util.Scanner;

public class Asgn_01_Q3 {

	public static void main(String[] args) {
		int choice;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("--------------------");
			System.out.println("**MENU**");
			System.out.println("1. Dosa - 70");
			System.out.println("2. Idli - 50");
			System.out.println("3. Samosa - 20");
			System.out.println("4. Kachori - 30");
			System.out.println("5. Dhokla - 30");
			System.out.println("6. Misal - 40");
			System.out.println("7. Upma - 25");
			System.out.println("8. Coffee - 20");
			System.out.println("9. Tea - 15");
			System.out.println("10. Generate Bill");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
			System.out.println("--------------------");

			switch (choice) {
			case 1 : total = total + 70;
			System.out.println("Dosa added.");
			break;
			case 2 : total = total + 50;
			System.out.println("Idli Added.");
			break;
			case 3 : total = total + 20;
			System.out.println("Samosa added");
			break;
			case 4 : total = total + 30;
			System.out.println("Kachori Added");
			break;
			case 5 : total = total + 30;
			System.out.println("Dhokla Added");
			break;
			case 6 : total = total + 40;
			System.out.println("Misal Added");
			break;
			case 7 : total = total + 25;
			System.out.println("Upma Added");
			break;
			case 8 : total = total + 20;
			System.out.println("Coffee Added");
			break;
			case 9 : total = total + 50;
			System.out.println("Tea Added");
			break;
			case 10 : System.out.println("Total Bill : "+total);
			break;
			}
		} while (choice != 0 && choice !=10);
		
		System.out.println("Thank you!");
	}

}