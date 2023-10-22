package tester;

import java.util.List;
import java.util.Scanner;

import com.sunbeam.Candidate;
import com.sunbeam.CandidateDao;
import com.sunbeam.PartyVotes;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, id, votes, cnt;
		String name, party;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("0 : Exit");
			System.out.println("1 : Add Candidate");
			System.out.println("2 : Update Candidate");
			System.out.println("3 : Delete Candidate");
			System.out.println("4 : Display All Candidates");
			System.out.println("5 : Increment Candidate Vote");
			System.out.println("6 : Get Candidates from a specified party");
			System.out.println("7 : Get partywise total votes");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("-----------------------------------------");

			switch (choice) {
			case 0:
				break;
			case 1:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter ID : ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name : ");
					name = sc.nextLine();
					System.out.print("Enter Party : ");
					party = sc.nextLine();
					System.out.print("Enter Votes : ");
					votes = sc.nextInt();
					cnt = dao.save(id, name, party, votes);
					System.out.println(cnt + " Candidate Added Successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter ID to update : ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name : ");
					name = sc.nextLine();
					System.out.print("Enter Party : ");
					party = sc.nextLine();
					cnt = dao.update(id, name, party);
					System.out.println(cnt + " Candidate updated successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter ID to delete : ");
					id = sc.nextInt();
					sc.nextLine();
					cnt = dao.deleteById(id);
					System.out.println(cnt + " Candidate deleted successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try (CandidateDao dao = new CandidateDao()) {
					List<Candidate> list = dao.findAll();
					list.forEach(e -> System.out.println(e));

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter id : ");
					id = sc.nextInt();
					dao.incrementVote(id);
					System.out.println("Incremented Successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter party : ");
					sc.nextLine();
					party = sc.nextLine();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(e -> System.out.println(e));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 7:
				try (CandidateDao dao = new CandidateDao()) {
					List<PartyVotes> list = dao.partyWiseVotes();
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
