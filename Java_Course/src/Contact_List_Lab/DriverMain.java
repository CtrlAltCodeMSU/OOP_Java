package Contact_List_Lab;

 class Contact {
	String name;
	String phoneNumber;
	 public Contact(String n , String pn){
			this.name = n ;
			this.phoneNumber = pn ;
	 }
}

class ContactManager{
	 Contact[] myContacts;
	 int contactsCount ;

	 public ContactManager(){
		  myContacts = new Contact[500];
		  contactsCount = 0 ;
	 }

	 public void addContacts(String name, String phoneNumber){
			Contact newContact = new Contact(name, phoneNumber);
			myContacts[contactsCount] = newContact;
			contactsCount++;
		   System.out.println("Contact Added Successfully!");
	 }
	 public Contact searchContacts(String name){
		for (int i = 0 ; i < contactsCount ; i++){
			if (myContacts[i].name.equalsIgnoreCase(name)){
				return myContacts[i];
			}
		}
		return null;
	 }
}
public class DriverMain {
	public static void main(String[] args) {
		ContactManager myContactsManager = new ContactManager();
		Contact myNew = new Contact("Ali", "0348-4443718");
		myContactsManager.addContacts(myNew.name , myNew.phoneNumber);

	}
}
