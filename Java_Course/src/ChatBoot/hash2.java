package ChatBoot;
import java.util.HashMap;
import java.util.Scanner;
class Student{
	int id;
	String name;
	HashMap<Integer , String> students = new HashMap<>();
	public void addStudents(int id, String name){
		students.put(id, name);
	}
	public void listAllStudents(){
		for (Integer key : students.keySet()){
			System.out.println("Id: " + key + " Name: "+ students.get(key));
		}
	}

	public void searchStudent(int idx){
		if (students.containsKey(idx)){
			System.out.println("Key:" + idx + " Name: " + students.get(idx));
		}
		else {
			System.out.println("Not found!");
		}
	}
	public void removeStudent(int idx){
		if (students.containsKey(idx)){
			students.remove(idx);
			System.out.println("Removed Successfully!");
		}
		else {
			System.out.println("Id not found!");
		}
	}
}
public class hash2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Detail: ");
		int choice = 1;
		while (choice!=5) {
			System.out.println("1. Add Elements");
			System.out.println("2. Remove Element");
			System.out.println("3. Search Element");
			System.out.println("4. List All Elements");
			System.out.println("5. Exit");
			System.out.println("Enter Your choice between 1 - 5: ");
			choice = in.nextInt();

			switch (choice){
				case 1:
					for (int i =  0 ; i < 1 ; i++){
						System.out.println("Enter ID: #" + (i+1));
						int id = in.nextInt();
						in.nextLine();
						System.out.println("Enter Name: #" + (i+1));
						String name = in.nextLine();
						s1.addStudents(id , name);
					}
					System.out.println("Added Successfully!");
					break;
				case 2:
					System.out.println("Enter key for remove: ");
					int remove = in.nextInt();
					s1.removeStudent(remove);
					System.out.println("Removed!");
					break;
				case 3:
					System.out.println("Enter key: ");
					int key = in.nextInt();
					s1.searchStudent(key);
					break;
				case 4:
					System.out.println("Now listing all Ids: ");
					s1.listAllStudents();
					break;
				case 5:
					System.out.println("Exiting the program!");
					break;
				default:
					System.out.println("invalid or wrong input!");
			}
		}
	}
}

