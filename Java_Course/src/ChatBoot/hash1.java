package ChatBoot;
import java.util.HashMap;
class Detail{
	HashMap<Integer , String> student = new HashMap<>();

	public void addStudent(int id , String name){
		student.put(id , name);
	}
	public HashMap<Integer , String> getAllStudents(){
		return student;
	}
}
public class hash1 {
	public static void main(String[] args) {
		Detail d1 = new Detail();
		d1.addStudent(101 , "Alice");
		d1.addStudent(102 , "Joe");
		d1.addStudent(103 , "Biden");
		d1.addStudent(104 , "elexa");

		HashMap<Integer ,String> list = d1.getAllStudents();
		for (Integer key : list.keySet()){
			System.out.println("ID: " + key + " Name: " + list.get(key));
		}
	}
}
