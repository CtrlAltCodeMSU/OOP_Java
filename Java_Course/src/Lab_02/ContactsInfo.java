//package Lab_02;
//import java.util.*;
//class Contact{
//	String name ;
//	String phoneNumber ;
//
//	public Contact(String name , String phoneNumber){
//		this.name = name ;
//		this.phoneNumber = phoneNumber ;
//	}
//}
//class ContactsManager{
//	Contact [] myContacts;
//	int contactsCount ;
//
//	public ContactsManager(){
//		contactsCount = 0 ;
//		myContacts = new Contact[500] ;
//	}
//	public void addContacts(String name , String phoneNumber){
//		Contact newContact = new Contact(name , phoneNumber);
//		myContacts[contactsCount] = newContact ;
//		contactsCount++;
//	}
//	public Contact searchContacts(String name){
//		for(int i = 0 ; i < contactsCount; i++){
//			if(myContacts[i].name.equalsIgnoreCase(name)){
//				return myContacts[i];
//			}
//		}
//		return null;
//	}
//}
//
//public class ContactsInfo {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ContactsManager cm = new ContactsManager();
//		System.out.println("How many Contacts do u want to add?");
//
//		int numberOfContacts = sc.nextInt();
//		for (int i = 0 ; i < numberOfContacts ; i++) {
//			System.out.println("Enter Detail for contact # " + (i + 1) + ": ");
//			System.out.println("Enter Name: ");
//			String name = sc.nextLine();
//
//			System.out.println("Enter Phone Number: ");
//			String number = sc.nextLine();
//			cm.addContacts(name, number);
//		}
//
//		System.out.println("Do u want to search for the contacts?? (Yes or No)");
//		String searchOption = sc.nextLine();
//
//		if (searchOption.equalsIgnoreCase("yes")){
//			System.out.println("Enter the name for search: ");
//			String searchName =  sc.nextLine();
//			Contact foundContact = cm.searchContacts(searchName);
//
//			if(foundContact != null){
//				System.out.println("Phone Number of Jane Smith: " + foundContact.phoneNumber);
//			}
//			else{
//				System.out.println("Contact Not found!");
//			}
//		}
//	}
//}
