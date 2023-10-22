package tester;

import java.util.List;
import java.util.Scanner;

import com.sunbeam.User;
import com.sunbeam.UserDAO;

public class UserMain {

	public static void main(String[] args) {
		int choice, id;
		String firstName, lastName, email, password, dob, role;
		boolean status;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------");
			System.out.println("0 : Exit");
			System.out.println("1 : Add User");
			System.out.println("2 : Update User Password");
			System.out.println("3 : Delete User");
			System.out.println("4 : Show Users");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("---------------------");
			switch (choice) {
			case 0:
				break;

			case 1:
				try (UserDAO dao = new UserDAO()) {
					System.out.print("Enter ID : ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter First Name : ");
					firstName = sc.nextLine();
					System.out.print("Enter Last Name : ");
					lastName = sc.nextLine();
					System.out.print("Enter Email : ");
					email = sc.nextLine();
					System.out.print("Enter Password : ");
					password = sc.nextLine();
					System.out.print("Enter DOB : ");
					dob = sc.nextLine();
					System.out.print("Enter Role : ");
					role = sc.nextLine();
					System.out.print("Enter status : ");
					status = sc.nextBoolean();

					dao.addUser(id, firstName, lastName, email, password, dob, status, role);
					System.out.println("User added successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try (UserDAO dao = new UserDAO()) {
					System.out.print("Enter ID : ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new password : ");
					password = sc.nextLine();
					dao.updateEmail(id, password);
					System.out.println("Password updated successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;

			case 3:
				try (UserDAO dao = new UserDAO()) {
					System.out.print("Enter ID : ");
					id = sc.nextInt();
					dao.deleteUser(id);
					System.out.println("User deleted successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				try (UserDAO dao = new UserDAO()) {
					List<User> list = dao.showUser();
					list.forEach(e -> System.out.println(e));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Please enter a valid choice.");
			}
		} while (choice != 0);
		System.out.println("Thank you for using the application.");
	}

}
