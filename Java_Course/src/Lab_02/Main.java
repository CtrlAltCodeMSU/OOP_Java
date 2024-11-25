package Lab_02;
import java.util.Scanner;   

 
class Contact {
	String name;           
	String phoneNumber;     

	 
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}

 
class ContactsManager {
	Contact[] myContacts;   
	int contactsCount;      

	 
	public ContactsManager() {
		contactsCount = 0;   
		myContacts = new Contact[500];   
	}

	public void addContact(String name, String phoneNumber) {
		Contact newContact = new Contact(name, phoneNumber);   
		myContacts[contactsCount] = newContact;   
		contactsCount++;   
		System.out.println("Contact added successfully!");
	}

	public Contact searchContact(String name) {
		for (int i = 0; i < contactsCount; i++) {
			if (myContacts[i].name.equalsIgnoreCase(name)) {
				return myContacts[i];   
			}
		}
		return null;   
	}
}

 
public class Main {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);

		 
		ContactsManager myContactsManager = new ContactsManager();

		 
		System.out.print("How many contacts do you want to add? ");
		int numberOfContacts = scanner.nextInt();   
		scanner.nextLine();   

		 
		for (int i = 0; i < numberOfContacts; i++) {
			System.out.println("Enter details for contact " + (i + 1));

			System.out.print("Enter name: ");
			String name = scanner.nextLine();   

			System.out.print("Enter phone number: ");
			String phoneNumber = scanner.nextLine();   

			myContactsManager.addContact(name, phoneNumber);
		}

		 
		System.out.print("Do you want to search for a contact? (yes/no): ");
		String searchOption = scanner.nextLine();

		if (searchOption.equalsIgnoreCase("yes")) {
			 
			System.out.print("Enter the name of the contact to search: ");
			String searchName = scanner.nextLine();

			 
			Contact foundContact = myContactsManager.searchContact(searchName);

			 
			if (foundContact != null) {
				System.out.println("Contact found! Phone number: " + foundContact.phoneNumber);
			} else {
				System.out.println("Contact not found.");
			}
		}

		 
		scanner.close();
	}
}
