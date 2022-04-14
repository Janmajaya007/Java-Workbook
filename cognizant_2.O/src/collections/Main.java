package collections;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			menu();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				choice1();
				break;
			case 2:
				choice2();
				break;
			case 3:
				choice3();
				break;
			case 4:
				choice4();
				break;
			default:
				break;
			}
		}
		while(choice !=5);
		sc.close();
	}

	public static void choice4( ) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Phone number to remove :");
		long phone = sc.nextLong();
		PhoneBook pb = new PhoneBook();
		System.out.println("Do you want to remove the contact (Y/N):");
		char ch = sc.next().charAt(0);
		if (ch == 'Y') {
			pb.removeContact(phone);
			System.out.println("The contact is successfully deleted.");
		}
	}

	public static void choice3( ) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Phone number to search contact: ");
		long phone = sc.nextLong();
		PhoneBook pb = new PhoneBook();
		System.out.println("The contact is: ");
		System.out.println("First Name: " + pb.viewContactGivenPhone(phone).getFirstName());
		System.out.println("Last Name: " + pb.viewContactGivenPhone(phone).getLastName());
		System.out.println("Phone No.: " + pb.viewContactGivenPhone(phone).getPhoneNumber());
		System.out.println("Email: " + pb.viewContactGivenPhone(phone).getEmailId());
	}

	public static void choice2() {
		System.out.println("The contacts in the List are:");
		PhoneBook pb = new PhoneBook();
		List<Contact> cc = pb.getList();
		for (int i = 0; i < cc.size(); i++) {
			System.out.println("First Name: " + cc.get(i).getFirstName());
			System.out.println("Last Name: " + cc.get(i).getLastName());
			System.out.println("Phone No.: " + cc.get(i).getPhoneNumber());
			System.out.println("Email: " + cc.get(i).getEmailId());
		}
	}

	public static void choice1() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Add a Contact: ");
		System.out.println("Enter the First Name: ");
		String fname = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String lname = sc.nextLine();
		System.out.println("Enter the Phone No.: ");
		long phoneNo = sc.nextLong();
		System.out.println("Enter the Email: ");
		String email = sc.nextLine();
		sc.next();
		Contact c = new Contact(fname, lname, phoneNo, email);
		PhoneBook pb = new PhoneBook();
		pb.addContact(c);
	}

	public static void menu() {
		System.out.println("Menu");
		System.out.println("1.Add Contact");
		System.out.println("2.Display all contacts");
		System.out.println("3.Search contact by phone");
		System.out.println("4.Remove contact");
		System.out.println("5.Exit");
		System.out.println("Enter your choice: ");
	}
}
